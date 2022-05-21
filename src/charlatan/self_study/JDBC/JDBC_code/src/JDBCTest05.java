import java.sql.*;

/**
 * time :2022/5/21 15:00 16
 * ClassName :JDBCTest05
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class JDBCTest05 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
//        查询结果集
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode", "root", "123456");
            stmt = conn.createStatement();

            String sql = "select ENAME,SAL from emp";
//            发送静态的 select 语句
            rs = stmt.executeQuery(sql);

/*//            re.next() 返回值是一个布尔值，判断是否有下一个
            while (rs.next()) {
//                使用 getString 方法获取对应下标的值，无论是什么类型都会转换为String类型
//                JDBC 中所有下标从 1 开始
                String ename = rs.getString(1);
//                这里的 1 和 2 代表的一行数据的第几列
                String sal = rs.getString(2);
                System.out.println(ename + ", " + sal);
            }
            */


/*            while (rs.next()) {
//                这里也能写取出指定数据的名称，这种方式更加健壮
//                以列的名字获取对应的内容
//                如果查询结果经过重命名，那么必须写重命名后的内容
                String ename = rs.getString("ENAME");
                String sal = rs.getString("SAL");
                System.out.println(ename + ", " + sal);
            }*/


            while (rs.next()) {
                String ename = rs.getString("ENAME");
//                直接以数字的形式查询内容【其他方式同理】
                int sal = rs.getInt("SAL");
                System.out.println(ename + ", " + (sal + 100));
            }


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
//            关闭连接
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
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
