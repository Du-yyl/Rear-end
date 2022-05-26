package com.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * time :2022/5/26 10:38 02
 * ClassName :ServletTest01
 * Package :com.servlets
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ServletTest01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("访问到了");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        writer.print(username);
        writer.print(password);
        writer.print("这是post请求");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        writer.print(username);
        writer.print(password);
        writer.print("这是post请求");
    }
}
