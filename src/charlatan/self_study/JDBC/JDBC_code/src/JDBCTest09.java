import util.DBUtil;

import java.sql.*;

/**
 * time :2022/5/22 16:19 14
 * ClassName :JDBCTest09
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class JDBCTest09 {
    public static void main(String[] args) {
        /*
        - getColumnName(int column)：获取指定列的名称
        - getColumnLabel(int column)：获取指定列的别名
        - getColumnCount()：返回当前 ResultSet 对象中的列数。

        - getColumnTypeName(int column)：检索指定列的数据库特定的类型名称。
        - getColumnDisplaySize(int column)：指示指定列的最大标准宽度，以字符为单位。
        - isNullable**(int column)：指示指定列中的值是否可以为 null。

        - isAutoIncrement(int column)：指示是否自动为指定列进行编号，这样这些列仍然是只读的。
         */
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        ResultSetMetaData rsmd = null;
        try {
            conn = DBUtil.getConnection("jdbc:mysql://localhost:3306/JDBC_test", "root", "123456");
            String sql = "select realName from t_user";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
//            while (rs.next()) {
//                System.out.println(rs.getString("realName"));
//            }

            rsmd = rs.getMetaData();
//            getColumnName(int column)：获取指定列的名称
            System.out.println(rsmd.getColumnName(1));
//            - getColumnCount()：返回当前 ResultSet 对象中的列数。
            System.out.println(rsmd.getColumnCount());
//            - getColumnTypeName(int column)：检索指定列的数据库特定的类型名称。
            System.out.println(rsmd.getColumnTypeName(1));
//            - getColumnDisplaySize(int column)：指示指定列的最大标准宽度，以字符为单位。
            System.out.println(rsmd.getColumnDisplaySize(1));
//            - isNullable**(int column)：指示指定列中的值是否可以为 null。
            System.out.println(rsmd.isNullable(1));

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn, ps, rs);
        }
    }
}
