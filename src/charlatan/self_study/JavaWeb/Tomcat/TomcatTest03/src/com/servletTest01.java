package com;

import org.jetbrains.annotations.NotNull;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 * time :2022/5/24 19:21 01
 * ClassName :servletTest01
 * Package :com
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */

/*
这种方式直接实现了接口中的所有内容，但是不是所有的内容都是所需要的，所以不建议使用这种方式进行实现，可以使用实现类进行处理
通过实现类，先指定要实现的方法， 然后通过这个类进行继承，这也是进行继承 HttpServlet
 */
public class servletTest01 implements Servlet {
    public servletTest01() {
        System.out.println("无参数构造方法执行");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest request, @NotNull ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_web", "root", "123456");
            String sql = "select name from t_user";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String str = rs.getString("name");
                out.print("<h1>" + str + "</h1>");
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
            if (ps != null) {
                try {
                    ps.close();
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

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
