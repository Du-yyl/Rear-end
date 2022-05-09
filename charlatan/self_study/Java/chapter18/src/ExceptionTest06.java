/**
 * time :2022/5/9 23:51 54
 * ClassName :ExceptionTest06
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ExceptionTest06 {
    public static void main(String[] args) {
        /*
        try 和 finally ，没有 catch
        放在 finally 语句块中的代码是一定会执行的
        以下代码先运行 try ，然后是 finally 语句，最后是 return
         */
        try {
            System.out.println(10 / 0);
            return;
        } finally {
            System.out.println("即使出现 return 也会继续运行");
            System.out.println("测试内容");
        }
    }
}
