package com.servlets;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * time :2022/5/25 20:54 17
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
        /*
         *  ServletContext对象是谁创建的？在什么时候创建的？
         *      ServletContext对象在WEB服务器启动的时候创建。
         *      ServletContext对象是WEB服务器创建的。
         *      对于一个webapp来说，ServletContext对象只有一个。
         *      ServletContext对象在服务器关闭的时候销毁。
         *
         *  ServletContext怎么理解？
         *      context是什么意思？
         *          Servlet对象的环境对象。（Servlet对象的上下文对象。）
         *      ServletContext对象其实对应的就是整个 web.xml 文件。
         *      50个学生，每个学生都是一个 Servlet，这50个学生都在同一个教室当中。那么这个教室就相当于ServletContext对象。
         *      放在 ServletContext 对象当中的数据，所有Servlet一定是共享的。
         *      比如：一个教室中的空调是所有学生共享的，一个教室中的语文老师是所有学生共享的。
         *      Tomcat 是一个容器，一个容器当中可以放多个 webapp ，一个 webapp 对应一个 ServletContext 对象。
         */
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.print(this.getServletContext());
    }
}
