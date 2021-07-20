package com.servlet;

import com.pojo.Person;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=utf-8");
        req.setCharacterEncoding("UTF-8");

        HttpSession session = req.getSession();
        session.setAttribute("person", new Person("Rose", 12));

        // get the id of session
        String id = session.getId();

        if (session.isNew())
        {
            resp.getWriter().write("session created successfully!");
        } else {
            /*Session id is unique for each user
            * User will use the session id to find its data
            * */
            resp.getWriter().write("session" + id + " already exist");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
