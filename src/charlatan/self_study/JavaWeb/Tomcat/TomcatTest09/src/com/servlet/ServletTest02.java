package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * time :2022/5/26 23:08 50
 * ClassName :ServletTest02
 * Package :com.servlet
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ServletTest02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        /*
        这里因为是两个完全不同的作用域，所以不能直接进行访问
         */
        Object time = request.getAttribute("nowTime");
        writer.print(time);
    }
}
