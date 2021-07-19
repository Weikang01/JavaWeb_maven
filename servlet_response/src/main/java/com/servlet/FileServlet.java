package com.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

public class FileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = "D:\\github_sync\\JavaWeb_maven\\servlet_response\\target\\classes\\a.jpg";
        System.out.println(path);
        String filename = path.substring(path.lastIndexOf("\\") + 1);
        resp.setHeader("Content-disposition", "attachment; filename=" + URLEncoder.encode(filename, "UTF-8"));
        FileInputStream fis = new FileInputStream(path);
        byte[] buffer = new byte[1024];
        int len = fis.read(buffer);
        ServletOutputStream out = resp.getOutputStream();
        while (len != -1) {
            out.write(buffer, 0, len);
            len = fis.read(buffer);
        }

        out.close();
        fis.close();
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
