package com.sphz.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //获取前端请求的参数
        String name = req.getParameter("UserName");

        //登入成功
        if (name.equals("admin")) {
            //设置session的登入参数
            req.getSession().setAttribute("User_Name",req.getRequestedSessionId());
            resp.sendRedirect("/sys/success.jsp");
        } else {
            resp.sendRedirect("/error.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
