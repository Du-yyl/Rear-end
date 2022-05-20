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
    public static void main(String[] args) throws SQLException {
        // 1、注册驱动
        DriverManager.registerDriver(new Driver());
        // 2、获取连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode", "root", "123456");
        System.out.println(conn);
        // 3、获取数据库操作对象
//        这个方法创建的对象，是专门用来指定 sql 语句的
        Statement stmt = conn.createStatement();
        // 4、执行 sql
        String sql1 = "";
        // 5、处理查询结果集
        // 6、释放资源


    }
}
