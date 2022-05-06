/**
 * time :2022/5/6 16:29 19
 * ClassName :Test01
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Test01 {
    public static void main(String[] args) {
        /*
        实现者面向接口实现
        调用者面向接口调用
         */
        Consumer consumer = new Consumer();
        consumer.orderDishes();
    }
}
