/**
 * time: 2022/5/5 14:09 59
 * ClassName: SuperTest03
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class SuperTest03 {
    public static void main(String[] args) {
        Vip v = new Vip("张三");
        v.shop();
    }
}

class User {
    String name;

    public User() {

    }

    public User(String name) {
        this.name = name;
    }

}

class Vip extends User {
    public Vip() {
    }

    public Vip(String name) {
        super(name);
    }

    public void shop() {
        System.out.println(this.name);
        System.out.println(super.name);
        System.out.println(name);
    }
}
