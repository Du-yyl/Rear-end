/**
 * time :2022/5/9 23:59 25
 * ClassName :ExcepetionTest07
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ExceptionTest07 {
    public static void main(String[] args) {
        try {
            System.out.println("测试内容");
            System.exit(0);
        } finally {
            System.out.println("如果直接退出JVM，那么就不会执行");
        }
    }
}
