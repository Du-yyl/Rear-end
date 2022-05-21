package user_login;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * time :2022/5/21 17:53 43
 * ClassName :login_page
 * Package :user_login
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class show_page {

    /**
     * 登录提示页面
     *
     * @return 将用户输入内容封装为一个Map进行返回
     */
    public static Map<String, String> login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------");
        System.out.println("----------用户登录测试系统---------");
        System.out.print("请输入用户名：");
        String username = scanner.next();
        System.out.print("请输入密码：");
        String password = scanner.next();
        Map<String, String> Map = new HashMap<>();
        Map.put(username, password);
        return Map;
    }

    /**
     * 登录失败提示页面
     *
     * @return 返回布尔值，返回值如果是 true 表示用户要继续尝试密码
     */
    public static boolean login_err() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("账号或密码错误！，请选择重新输入，或退出系统（y/Y继续尝试，n/N退出系统");
        String request = scanner.next().trim();
        return request.equals("y") || request.equals("Y");
    }

    /**
     * 登录成功显示页面
     *
     * @param username 要提示的用户信息
     */
    public static void login_suc(String username) {
        System.out.println("***************************");
        System.out.println("*******恭喜您，登录成功********");
        System.out.println("*****欢迎您，" + username + "***");
        System.out.println("***************************");
    }

    /**
     * 如果用户多次尝试密码不正确，直接推出系统
     */
    public static void login_war() {
        System.out.println("您尝试次数过多，请稍后重试。");
        System.exit(0);
    }
}
