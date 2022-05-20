/**
 * time: 2022/5/5 13:53 00
 * ClassName: SuperTest02
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class SuperTest02 {
    public static void main(String[] args) {


    }
}

class A2 {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public A2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public A2() {
    }
}

class B2 extends A2 {
    private int no;

    public B2() {
    }

    public B2(int id, String name, int no) {
//        这里因为父类中的对应属性是 private 标识符进行控制的，所以如果直接进行调用会直接报错，可以通过调用父类中的构造方法进行访问，间接进行调用
        super(id, name);
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}
