/**
 * time :2022/5/9 23:39 00
 * ClassName :ExceptionTest05
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ExceptionTest05 {
    public static void main(String[] args) {
        /*
        try ... catch 中的 finally 语句：
            finally 子句是最后执行的，并且一定会执行，即使 try 语句块中的代码出现异常
         */
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            /*
            这里一般放一些一定要执行的代码，如果出现异常一些任务也必须完成
            一般在这里完成资源的释放
             */
            System.out.println("finally 执行了");
        }

    }
}
