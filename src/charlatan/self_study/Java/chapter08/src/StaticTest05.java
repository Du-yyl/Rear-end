/**
 * time: 2022/5/1 17:30 36
 * ClassName: StaticTest05
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class StaticTest05 {
    /*
    静态代码块
     */
    static {
        System.out.println("测试内容");
    }

    static {
        System.out.println("静态代码块可以写多个");
    }

    public static void main(String[] args) {
        System.out.println("静态代码块在main方法执行之前执行");
    }

    static {
        System.out.println("静态代码块不用在意书写位置，静态代码块永远最先执行");
    }
}
