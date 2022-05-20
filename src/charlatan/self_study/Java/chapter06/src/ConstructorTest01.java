/**
 * time: 2022/4/30 17:15 15
 * ClassName: ConstructorTest01
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ConstructorTest01 {
    public static void main(String[] args) {
        Vip v = new Vip();
        Vip v1 = new Vip(10);

    }
}

class Vip {
    int no;
    String name;

    public Vip() {
        System.out.println("模拟缺省构造器");
    }

    public Vip(int num) {
        System.out.println("只有一个参数的构造器");
        no = num;
    }
}
