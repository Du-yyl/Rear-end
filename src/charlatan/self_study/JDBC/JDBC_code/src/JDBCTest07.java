import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * time :2022/5/22 12:53 34
 * ClassName :JDBCTest07
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class JDBCTest07 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pr = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_test", "root", "123456");
//            将自动提交禁用
            conn.setAutoCommit(false);
            String sql = "update t_user set realName = ? where id = ? ";
            pr = conn.prepareStatement(sql);
            pr.setString(1, "123");
            pr.setInt(2, 15);
            int count = pr.executeUpdate();

            pr.setString(1, "123");
            pr.setInt(2, 16);
            count += pr.executeUpdate();
//          如果能到这里一定没有问题，将数据进行提交
            conn.commit();
            System.out.println(count);
        } catch (ClassNotFoundException | SQLException e) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
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
