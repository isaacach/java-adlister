<<<<<<<< HEAD:src/main/java/controllers/CounterServlet.java
package controllers;
========
package com.codeup.adlister.controllers;
>>>>>>>> user-input-exercise:src/main/java/com/codeup/adlister/controllers/CounterServlet.java

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.CounterServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet {
    private int counter = 0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        counter += 1;
        response.getWriter().println("<h1>The count is " + counter + ".</h1>");
    }
}
