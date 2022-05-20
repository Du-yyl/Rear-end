/**
 * time: 2022/5/3 21:03 34
 * ClassName: ExtendsTest02
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ExtendsTest02 {
    public static void main(String[] args) {
        /*
        使用继承提升代码的复用性
         */
        A2 a = new A2(12, "测试");
        System.out.println(a.getName());
        B2 b1 = new B2(12);
        b1.sayName();
        B2.syaHello();
    }
}

class A2 {
    private int no;
    private String name;

    public A2() {
    }

    public A2(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayName() {
        System.out.println("name");
    }

    public static void syaHello() {
        System.out.println("syaHello");
    }
}

class B2 extends A2 {
    private int id;

    public B2(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
