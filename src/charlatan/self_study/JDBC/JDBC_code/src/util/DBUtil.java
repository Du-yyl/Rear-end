package util;

import java.sql.*;

/**
 * time :2022/5/22 13:25 28
 * ClassName :DBUtil
 * Package :util
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class DBUtil {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //    私有化构造方法，不让别人new对象
    private DBUtil() {
    }

    /**
     * 获取连接对象
     *
     * @param url      连接的 url
     * @param user     登录用户
     * @param password 登录密码
     * @return 返回连接对象
     * @throws SQLException 将异常直接抛出
     */
    public static Connection getConnection(String url, String user, String password) throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    /**
     * 关闭资源
     *
     * @param conn 数据库连接对象
     * @param stmt 数据库操作对象
     * @param rs   数据库结果集
     */
    public static void close(Connection conn, Statement stmt, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        close(conn, stmt);
    }

    /**
     * 关闭资源
     *
     * @param conn 数据库连接对象
     * @param stmt 数据库操作对象
     */
    public static void close(Connection conn, Statement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        close(conn);
    }

    /**
     * 关闭资源
     *
     * @param conn 数据库连接对象
     */
    public static void close(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 试条件回滚
     *
     * @param conn 要回滚的连接
     * @throws SQLException 将异常交给调用者处理
     */
    public static void connRollback(Connection conn) throws SQLException {
        if (conn != null) {
            conn.rollback();
        }
    }
}
