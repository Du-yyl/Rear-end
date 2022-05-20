import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * time :2022/5/20 22:03 01
 * ClassName :JDBCTest03
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class JDBCTest03 {
    public static void main(String[] args) {
//        获取连接的第一种方式
//        try {
//            DriverManager.registerDriver(new Driver());
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode", "root", "123456");
//            System.out.println("ERROR:Test");
//            System.out.println("FATAL:Test");
//            System.out.println("WARN:Test");
//            System.out.println("DEBUG:Test");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

//        获取连接的第二种方式【更常用】
        try {
//            使用反射机制运行这个类中的静态代码块，完成对应内容的获取
            /*
                Mysql的JDBC中的Driver的静态代码块
                static {
                    try {
                        java.sql.DriverManager.registerDriver(new Driver());
                    } catch (SQLException E) {
                        throw new RuntimeException("Can't register driver!");
                    }
                }
             */
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode", "root", "123456");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
