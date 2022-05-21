package user_login;

import java.sql.*;

/**
 * time :2022/5/21 18:25 32
 * ClassName :mysql_pre
 * Package :user_login
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class mysql_pre {
    private String url;
    private String user;
    private String password;
//    jdbc:mysql://localhost:3306/bjpowernode

    /**
     * 实例化对象
     *
     * @param host     主机地址
     * @param port     端口
     * @param database 数据库名称
     * @param user     登录用户名
     * @param password 登录密码
     */
    public mysql_pre(String host, String port, String database, String user, String password) {
        this.url = "jdbc:mysql://" + host + ":" + port + "/" + database;
        this.user = user;
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /*
      进入类中直接进行数据库连接
     */
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 登录方法
     *
     * @param u_name     要登录的用户名
     * @param u_password 要登录的密码
     * @return 返回是否登录成功
     * @throws SQLException 将数据库异常交给调用者处理
     */
    public String login(String u_name, String u_password) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet set = null;

        try {

            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();
            String queryCon = "password";
            String realName = "realName";
//        System.out.println("select " + queryCon + " from t_user where username = '" + u_name+"'");
            set = stmt.executeQuery("select " + queryCon + "," + realName + " from t_user where username = '" + u_name + "'");
            while (set.next()) {
                if (set.getString(queryCon).equals(u_password)) {
                    System.out.println(set.getString(queryCon));
                    System.out.println(u_password);
                    return set.getString(realName);
                }
            }
            return "";
        } finally {
            if (set != null) {
                set.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }
}
