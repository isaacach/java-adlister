<<<<<<<< HEAD:src/main/java/controllers/LoginServlet.java
package controllers;
========
package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;
>>>>>>>> user-input-exercise:src/main/java/com/codeup/adlister/controllers/LoginServlet.java

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

<<<<<<<< HEAD:src/main/java/controllers/LoginServlet.java
@WebServlet(name = "controllers.LoginServlet", urlPatterns = "/login")
========
@WebServlet("/login")
>>>>>>>> user-input-exercise:src/main/java/com/codeup/adlister/controllers/LoginServlet.java
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = DaoFactory.getUsersDao().findByUsername(username);

        if (user == null) {
            response.sendRedirect("/login");
            return;
        }

        boolean validAttempt = password.equals(user.getPassword());

        if (validAttempt) {
            request.getSession().setAttribute("user", user);
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }
    }

}
