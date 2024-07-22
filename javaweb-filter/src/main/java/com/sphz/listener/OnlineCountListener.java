package com.sphz.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class OnlineCountListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        HttpSession session = se.getSession();

        ServletContext context = session.getServletContext();
        Integer count = (Integer) context.getAttribute("OnlineCount");
        if (count == null) {
            context.setAttribute("OnlineCount", 1);
        } else {
            context.setAttribute("OnlineCount", count + 1);
        }

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        HttpSession session = se.getSession();

        ServletContext context = session.getServletContext();
        Integer count = (Integer) context.getAttribute("OnlineCount");

        if (count == null) {
            context.setAttribute("OnlineCount", 0);
        } else {
            context.setAttribute("OnlineCount", count - 1);
        }
    }
}
