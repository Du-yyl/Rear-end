package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

/**
 * time :2022/5/26 17:51 16
 * ClassName :ServletTest01
 * Package :com.servlet
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ServletTest01 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        /*
        传入的第一个参数是 Tomcat 中进行创建并传入，内部保存了协议的版本和基础信息【并且内部内容可以使用对应方法调用】
         */
        writer.print(request + "<br>");

//        常用方法

//        获取所有的参数集合，封住到一个 map 中进行返回
        Map<String, String[]> map = request.getParameterMap();
        Set<Map.Entry<String, String[]>> set = map.entrySet();
        for (Map.Entry<String, String[]> stringEntry : set) {
            writer.print(stringEntry + "<br>");
        }
        writer.print("------------------------------------<br>");
//        获取所有的属性名
        Enumeration<String> names = request.getParameterNames();
        while (names.hasMoreElements()) {
            String name = names.nextElement();
//            因为复选框会使用多个属性名和属性值进行传递，所以要使用 String[] 进行数据的保存
            String[] values = request.getParameterValues(name);
            for (String value : values) {
                writer.print(name + " = " + value + "<br>");
            }
        }
        writer.print("------------------------<br>");

//        这种方式只会拿到指定内容数组的第一个元素【这种方式更加常用】
        writer.print(request.getParameter("username") + "<br>");
        writer.print(request.getParameter("password") + "<br>");
    }
}
