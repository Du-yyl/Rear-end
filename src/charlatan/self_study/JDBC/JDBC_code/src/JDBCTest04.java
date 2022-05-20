import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

/**
 * time :2022/5/20 22:19 18
 * ClassName :JDBCTest04
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class JDBCTest04 {
    public static void main(String[] args) {
//        使用 properties 获取配置资源文件中的内容
/*
        Properties pro = new Properties();
        try {
            FileInputStream fis = new FileInputStream(".\\src\\charlatan\\self_study\\JDBC\\JDBC_code\\src\\JDBCTest04.properties");
            pro.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String className = pro.getProperty("className");
        String url = pro.getProperty("url");
        String user = pro.getProperty("user");
        String password = pro.getProperty("password");
        String sql = pro.getProperty("sql");
        */

//          使用 资源绑定器 获取配置文件中的内容
        ResourceBundle bundle = ResourceBundle.getBundle("JDBCTest04");
        String className = bundle.getString("className");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String password = bundle.getString("password");
        String sql = bundle.getString("sql");


        Connection conn = null;
        Statement stmt = null;
        try {
            // 注册驱动
            Class.forName(className);
            conn = DriverManager.getConnection(url, user, password);

            // 获取数据操作对象
            stmt = conn.createStatement();

            // 执行 sql 语句
            int count = stmt.executeUpdate(sql);
            System.out.println(count);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {

//            关闭连接
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
