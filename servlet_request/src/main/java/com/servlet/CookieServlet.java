package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Date;

public class CookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=utf-8");

        PrintWriter out = resp.getWriter();
        // Cookie
        Cookie[] cookies = req.getCookies();

        if (cookies!= null)
        {
            out.write("Your last login is: ");
            for (int i = 0; i < cookies.length; i++) {
                if (cookies[i].getName().equals("lastLogin")) {
                    long lastTimeLong = Long.parseLong(cookies[i].getValue());
                    Date date = new Date(lastTimeLong);
                    out.write(URLDecoder.decode(date.toLocaleString(), "utf-8"));
                }
            }
        }else {
            out.write("This is your 1st time to login");
        }
        Cookie lastLogin = new Cookie("lastLogin", System.currentTimeMillis() + "");
        lastLogin.setMaxAge(24*60*60); // this cookie will last 1 day
        // lastLogin.setMaxAge(0); // this cookie will expire right after closed the browser
        resp.addCookie(lastLogin);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
