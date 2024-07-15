package com.sphz.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CookieDemo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建一个新的cookie，名字必须要和删除的保持一致
        Cookie cookie = new Cookie("lastLoginTime", String.valueOf(System.currentTimeMillis()));

        //设置cookie的有效期为0，立马过期
        cookie.setMaxAge(0);

        //响应添加cookie
        resp.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
