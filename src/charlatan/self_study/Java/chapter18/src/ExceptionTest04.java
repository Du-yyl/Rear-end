/**
 * time :2022/5/9 23:17 06
 * ClassName :ExceptionTest04
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ExceptionTest04 {
    public static void main(String[] args) {
        NullPointerException npe = new NullPointerException("错误信息");
//        打印错误信息
        System.out.println(npe.getMessage());
//      打印堆栈信息【这个是单独的线程控制，所以不是同步的】
        npe.printStackTrace();
    }
}
