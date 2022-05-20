/**
 * time :2022/5/10 10:52 54
 * ClassName :Test
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Test {
    public static void main(String[] args) {
        UserService us = new UserService();
        try {
            us.requiter(args[0], args[1]);
        } catch (UserOperateException e) {
            e.printStackTrace();
        }
        System.out.println("任务完成");
    }
}
