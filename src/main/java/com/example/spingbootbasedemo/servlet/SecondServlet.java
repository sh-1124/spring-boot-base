package com.example.spingbootbasedemo.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("second Servlet run....");

        PrintWriter writer = resp.getWriter();
        writer.write("success second Servlet");
        writer.flush();
        writer.close();

    }
}
