package com.sphz.servlet;

import com.sphz.pojo.Person;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class SessionDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //编码
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        //获取
        HttpSession session = req.getSession();

        session.setAttribute("name", new Person("sphz", 1));

        PrintWriter out = resp.getWriter();

        String id = session.getId();

        if (session.isNew()) {
            out.write("新创建了一个Session,Id:" + id);
        } else {
            out.write("已经存在了一个Session,Id:" + id);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
