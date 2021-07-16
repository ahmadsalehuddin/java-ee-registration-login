package dao;

import bean.RegisterBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.DBConnection;

public class RegisterDao {

    PreparedStatement queryStmt, insertStmt;
    Connection connection = null;

    private void initialize() throws SQLException {
        connection = DBConnection.createConnection();
        queryStmt = connection.prepareStatement("SELECT ID FROM USERS");
        insertStmt = connection.prepareStatement("INSERT INTO USERS "
                + "VALUES (?, ?, ?, ?, ?)");
    }

    public String registerUser(RegisterBean registerbean) {

        try {
            initialize();
            insertStmt.setInt(1, generateID());
            insertStmt.setString(2, registerbean.getUsername());
            insertStmt.setString(3, registerbean.getPassword());
            insertStmt.setString(4, registerbean.getName());
            insertStmt.setString(5, registerbean.getEmail());
            insertStmt.executeUpdate();
            return "SUCCESS";
        } catch (SQLException sql) {
        }

        return "FAIL";
    }

    private int generateID() throws SQLException {
        int countRow = 1;
        ResultSet data = queryStmt.executeQuery();

        while (data.next()) {
            countRow++;
        }
        return countRow;
    }
}
