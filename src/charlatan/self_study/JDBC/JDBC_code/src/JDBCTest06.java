import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * time :2022/5/22 12:31 27
 * ClassName :JDBCTest06
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class JDBCTest06 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pr = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_test", "root", "123456");
            conn.createStatement();
            String sql = "insert into t_user (username, password, realName) value (?, ?, ?)";
//            进行预编译
            pr = conn.prepareStatement(sql);
//            对变量进行修改
            pr.setString(1, "测试");
            pr.setString(2, "测试");
            pr.setString(3, "测试");

            int count = pr.executeUpdate();
            System.out.println(count);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (pr != null) {
                try {
                    pr.close();
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
