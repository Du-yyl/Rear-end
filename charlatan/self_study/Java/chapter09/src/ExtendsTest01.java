/**
 * time: 2022/5/3 20:57 38
 * ClassName: ExtendsTest01
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ExtendsTest01 {
    public static void main(String[] args) {
        /*
        如果没有继承两个相似的类要书写相同或大量类似的方法，代码复用差
         */
        A1 a = new A1(12,"测试");
        B1 b = new B1(23,"测试2",34);
        System.out.println(a.getName());
        System.out.println(b.getNo());

    }
}

class A1 {
    private int no;
    private String name;

    public A1() {
    }

    public A1(int no, String name) {
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
}

class B1 {
    private int no;
    private String name;
    private int id;

    public B1() {
    }

    public B1(int no, String name, int id) {
        this.no = no;
        this.name = name;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}