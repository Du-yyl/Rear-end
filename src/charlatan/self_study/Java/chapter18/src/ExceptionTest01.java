/**
 * time :2022/5/9 20:36 48
 * ClassName :ExceptionTest01
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ExceptionTest01 {
    public static void main(String[] args) {
        /*
        异常也有其他名字：
            未受检异常：UnCheckedException
            非受检异常
        所有的异常都是发生在运行阶段
        异常发生后的两种处理方式：
            在方法声明的位置上使用 throws 关键字进行抛出
            使用 try ... catch 语句进行异常的捕捉
        Java中如果一直上抛，最终抛给 main 方法，main 方法继续上抛
        main方法抛给了调用者，最终结果就是终止虚拟机
         */
        NullPointerException npt = new NullPointerException("空指针报错");
        System.out.println(npt);
    }
}
