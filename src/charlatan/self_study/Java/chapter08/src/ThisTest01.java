/**
 * time: 2022/5/1 15:12 07
 * ClassName: ThisTest01
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ThisTest01 {
    public static void main(String[] args) {
        User4 u1 = new User4("张三");
        User4 u2 = new User4("李四");
        u1.sayName();
        u2.sayName();
    }
}

class User4 {
    String name;

    public User4() {
    }

    public User4(String name) {
        this.name = name;
    }

    public void sayName() {
        System.out.println("我的名字是:" + this.name);
        System.out.println("我的名字是:" + name);
        System.out.println(this);
    }
}
