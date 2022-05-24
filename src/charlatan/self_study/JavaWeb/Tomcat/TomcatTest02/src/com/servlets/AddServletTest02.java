package com.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 * time :2022/5/23 14:18 34
 * ClassName :AddServlet
 * Package :com.servlets
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class AddServletTest02 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        连接数据库
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
//            注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
//            获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_web", "root", "123456");
//            获取操作对象
            String sql = "select name from t_user";
//            预编译
            PreparedStatement ps = conn.prepareStatement(sql);
//            开始查询
            rs = ps.executeQuery();
//            对响应的编码进行处理
            resp.setContentType("text/html;charset=UTF-8");
//            获取输出流对象
            PrintWriter pw = resp.getWriter();
//            对结果进行遍历
            while (rs.next()) {
//                将结果中的内容取出
                String str = rs.getString("name");
//                将结果封装成html并像页面进行渲染
                pw.print("<h1>" + str + "</h1>");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
