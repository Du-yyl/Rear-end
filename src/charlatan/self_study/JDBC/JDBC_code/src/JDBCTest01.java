import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * time :2022/5/20 20:58 27
 * ClassName :JDBCTest01
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class JDBCTest01 {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        try {
            // 1、注册驱动
            DriverManager.registerDriver(new Driver());

            // 2、获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode", "root", "123456");
            System.out.println(conn);

            // 3、获取数据库操作对象
//        这个方法创建的对象，是专门用来指定 sql 语句的
            stmt = conn.createStatement();

            // 4、执行 sql
            String sql1 = "insert into t_student(id, name, class) VALUE (9, '张三', 3)";
//        这个方法用于执行 DML 语句（insert，update，delete），并且返回值是影响数据库中记录条数
            int count = stmt.executeUpdate(sql1);
            System.out.println(count);

            // 5、处理查询结果集

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {

            // 6、释放资源
//            在这里确保数据内容一定要关闭
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
