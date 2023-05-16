<<<<<<<< HEAD:src/main/java/controllers/AdsIndexServlet.java
package controllers;

import dao.DaoFactory;
========
package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
>>>>>>>> user-input-exercise:src/main/java/com/codeup/adlister/controllers/AdsIndexServlet.java

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
<<<<<<<< HEAD:src/main/java/controllers/AdsIndexServlet.java
import java.sql.SQLException;

@WebServlet("/ads")
========

@WebServlet(name = "controllers.AdsIndexServlet", urlPatterns = "/ads")
>>>>>>>> user-input-exercise:src/main/java/com/codeup/adlister/controllers/AdsIndexServlet.java
public class AdsIndexServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setAttribute("ads", DaoFactory.getAdsDao().all());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        request.getRequestDispatcher("/WEB-INF/ads/index.jsp").forward(request, response);
    }
}
