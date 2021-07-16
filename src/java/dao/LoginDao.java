/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.LoginBean;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import util.DBConnection;

/**
 *
 * @author ahmad
 */
public class LoginDao {
    public String authenticateUser(LoginBean loginbean) {
        String username = loginbean.getUsername();
        String password = loginbean.getPassword();
        
        Connection connection = null;
        Statement statement = null;
        ResultSet resultset = null;
        String usernameDB = null;
        String passwordDB = null;
        
        try {
            connection = DBConnection.createConnection();
            statement = connection.createStatement();
            resultset = statement.executeQuery("SELECT USERNAME, PASSWORD FROM USERS");
            
            while(resultset.next()) {
                usernameDB = resultset.getString("USERNAME");
                passwordDB = resultset.getString("PASSWORD");
                if(username.equals(usernameDB) && password.equals(passwordDB)) {
                    return "SUCCESS";
                }
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return "Invalid user credentials";
    }
}
