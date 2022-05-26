package com.servlets;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * time :2022/5/25 22:29 08
 * ClassName :ServletTest02
 * Package :com.servlets
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ServletTest02 extends GenericServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        // 获取ServletContext对象
        ServletContext application = this.getServletContext();

//        通过 Servlet 记录日志【这个会记录到 logs 的路径下】
//        IDEA会将日志记录在对应的 Using CATALINA_BASE 文件路径下
        /*
        localhost_access_log 这个文件保存的是访问日志，访问信息在这里存储
        localhost.  服务器运行过程中产生的输出的控制台信息会出现在这里
        catalina.   这个文件保存的是在编译过程中控制台信息

         */
        application.log("这是测试的内容");

        application.log("这是异常信息", new Exception("这里是异常信息"));


        /*
        ServletContext 中数据的增删改
         */
        ServletContext context = this.getServletContext();
        User user = new User("jock");
//        向全局配置中添加指定属性
        context.setAttribute("user", user);
//        获取全部内容的配置的名字
        Enumeration<String> name = context.getAttributeNames();
        while (name.hasMoreElements()) {
            String flag = name.nextElement();
//            通过配置的名字获取对应的属性配置项【如果没有配置指定属性会返回 null 】
            out.print(flag + " = " + context.getAttribute(flag) + "<br>");
        }
    }
}
