/**
 * time: 2022/4/27 18:04 28
 * ClassName: WhileTest01
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class WhileTest01 {
    public static void main(String[] args) {
        int i = 0;
//        while 先判断再执行【可能一次也不执行】
        while (i < 10) {
            i++;
            System.out.println("测试");
        }
//        do ... while 先执行再判断【一定会执行一次】
        do {
            System.out.println("测试的例子");
            i++;
        } while (false);

    }
}
