package user_login.test;

import user_login.mysql_pre;
import user_login.show_page;

import java.sql.SQLException;
import java.util.Map;
import java.util.Set;

/**
 * time :2022/5/21 18:52 04
 * ClassName :user_loginTest
 * Package :user_login.test
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class user_loginTest {
    public static void main(String[] args) {
        Map<String, String> map = null;

        mysql_pre mp = new mysql_pre("localhost", "3306", "JDBC_test", "root", "123456");
        int num = 0;
        while (num++ < 5) {
            map = show_page.login();
            Set<String> set = map.keySet();
            System.out.println("--------------------");
            for (String s : set) {
                try {
                    String userInfo = mp.login(s, map.get(s)).trim();
                    if (!"".equals(userInfo)) {
                        show_page.login_suc(userInfo);
                        System.exit(0);
                    } else {
                        show_page.login_err();
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        show_page.login_war();

    }
}
