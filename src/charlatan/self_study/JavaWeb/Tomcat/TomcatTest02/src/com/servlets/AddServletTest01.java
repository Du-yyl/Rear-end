package com.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * time :2022/5/23 14:18 34
 * ClassName :AddServlet
 * Package :com.servlets
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class AddServletTest01 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        post 方法默认情况下会出现乱码问题，所以需要经过指定的编码处理
//        get 方式不需要设置编码（tomcat 8才有的）
        req.setCharacterEncoding("utf-8");

        /*        *//*
        Tomcat8 之前进行 get 编码的转换
         *//*
//        先通过属性进行获取内容（这一步已经乱码）
        String username = req.getParameter("username");
//        将字符串内容全部转换为单独的内容
        byte[] bytes = username.getBytes("ISO-8859-1");
//        将字节按照指定的编码重新排序
        username = new String(bytes, StandardCharsets.UTF_8);
        */

        String username = req.getParameter("username");
        String id = req.getParameter("id");
        Integer iid = Integer.parseInt(id);
        System.out.println(username);
        System.out.println(iid);
//        其中 resp 能将指定内容输出到浏览器上
//        这种方式是开启一个数据流，这个流不需要刷新，不需要关闭，这些内容服务器都能完成
        PrintWriter pw = resp.getWriter();
//        指定响应结果的类型是 HTML ，按照HTML进行解析
        resp.setContentType("text/html;charset=utf-8");
        pw.println("Hello Servlet");
        pw.print("<h1>你好，世界</h1>");
        pw.print("<h1>Hello World</h1>");
        pw.print("");
        pw.println("Hello Servlet");
    }
}
