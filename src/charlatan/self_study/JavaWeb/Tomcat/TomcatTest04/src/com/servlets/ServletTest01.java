package com.servlets;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

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
//        将 Tomcat 中的传入的配置信息进行保存
        ServletConfig config = this.getServletConfig();
        writer.println(config + "<br>");
//        这个方法可以获取到 XML 中的 servlet-name 信息
        String name = config.getServletName();
        System.out.println(name);

//        通过这个方法可以获取指定配置的配置信息
        writer.println(config.getInitParameter("Driver") + "<br>");
        writer.println(config.getInitParameter("user") + "<br>");
        writer.println(config.getInitParameter("password") + "<br>");
        writer.print("----------------" + "<br>");
//        通过初始化的属性，获取对应的内容
//        不同类的配置文件信息应该在对应类的内部方法中进行访问，不然会出错
        Enumeration<String> names = config.getInitParameterNames();
        while (names.hasMoreElements()) {
            writer.print(names.nextElement() + "<br>");
        }

//        通过 config 获取到这个 config 这个的上下文
        ServletContext context = config.getServletContext();
//        通过 this 也能获取到这个内容
        this.getServletContext();
        writer.print(context + "<br>");
    }
}
