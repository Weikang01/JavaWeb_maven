package com.servlet;

import com.util.Constants;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        System.out.println("LoginServlet");
        if (username.equals("admin"))
        {
            req.getSession().setAttribute(Constants.USER_SESSION, req.getSession().getId());
            resp.sendRedirect("/s/sys/main.jsp");
            // login successfully
        } else {
            // failed to login
            resp.sendRedirect("/s/error.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
