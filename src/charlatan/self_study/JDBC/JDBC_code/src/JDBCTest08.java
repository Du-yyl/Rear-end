import util.DBUtil;

import java.sql.*;

/**
 * time :2022/5/22 13:41 06
 * ClassName :JDBCTest08
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class JDBCTest08 {
    public static void main(String[] args) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = null;
        try {
            conn = DBUtil.getConnection("jdbc:mysql://localhost:3306/JDBC_test", "root", "123456");
            String sql = "select username from t_user where username like ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, "%a_");
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("username"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn, ps, rs);
        }

    }
}
