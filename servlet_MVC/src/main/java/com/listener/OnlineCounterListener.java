package com.listener;


import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class OnlineCounterListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        ServletContext context = se.getSession().getServletContext();
        Integer count = (Integer) context.getAttribute("OnlineCount");
        if (count == null)
        {
            count = 1;
        } else {
            count += 1;
        }
        context.setAttribute("OnlineCount", count);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
    }

}
