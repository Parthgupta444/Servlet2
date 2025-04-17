package com.example;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * A simple servlet named Base that responds to HTTP requests.
 */
@WebServlet(asyncSupported = true, urlPatterns = {"/Base"})
public class Base extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public Base() {
        super();
        // Default constructor
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        // Initialization logic can go here if needed
    }

    @Override
    public void destroy() {
        // Clean-up operations if necessary
        super.destroy();
    }

    /**
     * Handles HTTP GET requests.
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String context = request.getContextPath();
        response.getWriter().write("Served at: " + context);
    }

    /**
     * Handles HTTP POST requests by delegating to doGet().
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        doGet(request, response);
    }
}
