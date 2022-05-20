/**
 * time: 2022/5/5 14:18 23
 * ClassName: SuperTest04
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class SuperTest04 {
    public static void main(String[] args) {
        Vip1 v = new Vip1("张三");
        v.shop();
    }
}

class User1 {
    String name;

    public User1() {

    }

    public User1(String name) {
        this.name = name;
    }

}

class Vip1 extends User1 {
    //    在子类中如果想访问父类中的同名属性，必须使用 super
    String name;

    public Vip1() {
    }

    public Vip1(String name) {
        super(name);
    }

    public void shop() {
        System.out.println(this.name);
        System.out.println(super.name);
        System.out.println(name);
    }
}
