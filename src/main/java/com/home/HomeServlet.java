package com.home;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeServlet extends HttpServlet {

    // Get Request Handler
    public void doGet(HttpServletRequest req,
            HttpServletResponse res) throws IOException, ServletException {
        // Serving the 'home.jsp' file to a user
        req.getRequestDispatcher("home.jsp").forward(req, res);
    }

    // Post Request Handler
    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        // If you wanted to read the body of a request do this:
        // String reqContent = req.getReader().readLine();

        // If you want the form values, do this:
        // String title = req.getParameter("title");

        // If you want to send back a response body, do this:
        // PrintWriter writer = res.getWriter();
        // writer.write(String.format("{ \"result\": \"%s\" }", resultingValue));

        // If you want to redirect the user after the request, do this:
        // res.sendRedirect(req.getContextPath() + "/");
    }
}