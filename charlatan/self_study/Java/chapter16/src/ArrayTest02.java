/**
 * time :2022/5/7 00:11 42
 * ClassName :ArrayTest02
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ArrayTest02 {
    /*

            main 方法是交给 JVM 调用的，main 中的参数，一般情况是没有值的
        这个数组什么时候里面会有值呢？
            其实这个数组是留给用户的，用户可以在控制台上输入参数，这个参数自动会被转换为“String[] args”
            例如这样运行程序：java ArrayTest05 abc def xyz
            那么这个时候JVM会自动将“abc def xyz”通过空格的方式进行分离，分离完成之后，自动放到“String[] args”数组当中。
            所以main方法上面的String[] args数组主要是用来接收用户输入参数的。
            把abc def xyz 转换成字符串数组：{"abc","def","xyz"}
     */
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
