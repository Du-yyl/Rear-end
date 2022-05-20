/**
 * time: 2022/5/5 13:29 31
 * ClassName: SuperTest01
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class SuperTest01 {
    public static void main(String[] args) {
//        new A1();
        new B1();
        new B1(2);
    }
}

class A1 {
    //    public A1(){
//        System.out.println("A1中的无参构造");
//    }
    public A1(int i) {
        System.out.println("A1中的有参构造");
    }
}

class B1 extends A1 {
    public B1() {
//        这里默认会先调用父类中的对应构造方法，不写也存在，并且和 this 一样，如果写了，那么就不会再存在了
//        this(1);
        super(1);
        System.out.println("B1中的无参构造");
    }

    public B1(int i) {
//        如果第一行没有 this（） 也没有 super（） 默认有一个 super（）
        this();
//        这里也有有一个无参父类无参构造的调用，如果父类中没有无参构造，那么直接书写直接报错
        System.out.println("B1中的有参构造");
    }
}
