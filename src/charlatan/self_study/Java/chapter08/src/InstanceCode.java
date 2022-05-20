/**
 * time: 2022/5/3 17:41 56
 * ClassName: InstanceCode
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class InstanceCode {
    {
        System.out.println("实例语句块");
    }

    public static void main(String[] args) {
        System.out.println("main方法中的内容");
        new InstanceCode();
        new InstanceCode();
    }

    {
        System.out.println("实例语句块");
    }
}
