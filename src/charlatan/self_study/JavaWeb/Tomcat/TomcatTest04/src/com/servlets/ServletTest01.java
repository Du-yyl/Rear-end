package com.servlets;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * time :2022/5/25 16:39 31
 * ClassName :ServletTest01
 * Package :com.servlets
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ServletTest01 extends GenericServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        ServletConfig config = this.getServletConfig();
        System.out.println(config);
        writer.print(config);
    }
}
