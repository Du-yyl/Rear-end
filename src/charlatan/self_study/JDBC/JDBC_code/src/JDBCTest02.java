import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * time :2022/5/20 21:46 26
 * ClassName :JDBCTest02
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class JDBCTest02 {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;

        try {
//            注册驱动
            DriverManager.registerDriver(new Driver());

//            获取连接
            String url = "jdbc:mysql://localhost:3306/bjpowernode";
            String user = "root";
            String passowrd = "123456";
            conn = DriverManager.getConnection(url, user, passowrd);

//            获取数据库操作对象
            stmt = conn.createStatement();
            String sql = "delete t_student from t_student where id = 8";

//            指定 sql 语句
            int cont = stmt.executeUpdate(sql);
            System.out.println(cont);

//            处理返回内容


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
//            关闭资源
            if (stmt != null) {
                try {
                    stmt.close();
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
