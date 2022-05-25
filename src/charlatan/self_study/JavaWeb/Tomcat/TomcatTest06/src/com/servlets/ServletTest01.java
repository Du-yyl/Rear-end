package com.servlets;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * time :2022/5/25 22:27 14
 * ClassName :ServletTest01
 * Package :com.servlets
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ServletTest01 extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter writer = res.getWriter();

//        获取到整体配置的对象
        ServletContext context = this.getServletContext();
        writer.print(context + "<br>");

//        将所有的配置名字获取到
        Enumeration<String> names = context.getInitParameterNames();

        while (names.hasMoreElements()) {
//            获取每一次遍历的内容
            String name = names.nextElement();
//            通过这个方法获取指定 name 的配置属性
            writer.print(name + " = " + context.getInitParameter(name) + "<br>");
        }

//        获取到这个应用的根【动态获取】
        writer.print(context.getContextPath() + "<br>");

//        获取文件的绝对路径【动态获取】【这个路径应该从 web 根下开始写】
        writer.print(context.getRealPath("/index.html"));
        writer.print(context.getRealPath("index.html"));

        /*
        获取各个不同链接的各自的信息
         */
//        获取对应文件链接的 config 信息
        ServletConfig config = this.getServletConfig();
//        将所有的配置名称获取到到
        Enumeration<String> initNames = config.getInitParameterNames();
//        将所有的内容进行遍历
        while (initNames.hasMoreElements()) {
//            获取下一个内容
            String name = initNames.nextElement();
//            将获取的名字活到指定的配置进行输出
            writer.print(name + " = " + config.getInitParameter(name) + "<br>");
        }
    }
}
