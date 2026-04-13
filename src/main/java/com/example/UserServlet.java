package com.example;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class UserServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("application/json");
        response.getWriter().write("[\"Arun\",\"DevOps\",\"AWS\"]");
    }
}
