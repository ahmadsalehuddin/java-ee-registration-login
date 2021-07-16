package controller;

import bean.RegisterBean;
import dao.RegisterDao;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List errorMsgs = new LinkedList();

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String confirm = request.getParameter("confirm");

        if (name == null || name.trim().length() == 0) {
            errorMsgs.add("Please enter name.");
        }

        if (email == null || email.trim().length() == 0) {
            errorMsgs.add("Please enter email.");
        }

        if (username == null || username.trim().length() == 0) {
            errorMsgs.add("Please enter username.");
        }

        if (password == null || password.trim().length() == 0) {
            errorMsgs.add("Please enter password.");
        }

        if (confirm == null || confirm.trim().length() == 0) {
            errorMsgs.add("Please enter confirm.");
        }

        if (!password.equals(confirm)) {
            errorMsgs.add("Please make sure password and confirm password match.");
        }

        if (errorMsgs.isEmpty()) {
            RegisterBean registerbean = new RegisterBean();
            registerbean.setName(name);
            registerbean.setEmail(email);
            registerbean.setUsername(username);
            registerbean.setPassword(password);
            
            RegisterDao registerdao = new RegisterDao();
            String status = registerdao.registerUser(registerbean);
            
            if(status.equals("SUCCESS")) {
                request.setAttribute("status", "New user has been successfully registered!");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            } else {
                request.setAttribute("status", "Fail to register new user!");
            }
        } else {
            request.setAttribute("errorMsgs", errorMsgs);
        }
        request.getRequestDispatcher("registration.jsp").forward(request, response);
    }

}
