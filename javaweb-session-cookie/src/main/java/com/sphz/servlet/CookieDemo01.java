package com.sphz.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class CookieDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        //响应设置文本格式为text与编码utf-8
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");

        PrintWriter out = resp.getWriter();

        //获取请求的cookie数组
        Cookie[] cookies = req.getCookies();

        if (cookies.length > 1) {
            out.write("上一次访问的时间：");
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("lastLoginTime")) {
                    long lastLoginTime = Long.parseLong(cookie.getValue());
                    Date date = new Date(lastLoginTime);
                    out.write(date.toLocaleString());
                }
            }
        } else {
            out.write("第一次访问");
        }

        //创建一个cookie，并且响应添加cookie
        resp.addCookie(new Cookie("lastLoginTime", String.valueOf(System.currentTimeMillis())));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
