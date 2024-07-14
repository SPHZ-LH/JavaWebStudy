package com.sphz.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

public class FileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String realPath = "D:\\JavaWebStudy\\javaweb-02-servlet\\response\\src\\main\\resources\\Snipaste_2024-02-22_16-48-49.png";
        System.out.println("下载地址" + realPath);
        String fileName = realPath.substring(realPath.lastIndexOf("\\") + 1);
        resp.setHeader("Content-Disposition", "attachment;filename=" + fileName);
        FileInputStream fis = new FileInputStream(realPath);
        int len = 0;
        byte[] bytes = new byte[1024];
        ServletOutputStream ops = resp.getOutputStream();
        while ((len = fis.read(bytes)) > 0) {
            ops.write(bytes, 0, len);
        }
        fis.close();
        ops.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
