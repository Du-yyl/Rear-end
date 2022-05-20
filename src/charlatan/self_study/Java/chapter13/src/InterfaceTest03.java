/**
 * time: 2022/5/5 21:35 05
 * ClassName: InterfaceTest03
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héro?sme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class InterfaceTest03 {
    public static void main(String[] args) {
        Inter1 i1 = new Inter();

//        接口和接口之间进行强制类型转换的时候，没有继承关系，也能完成强转
//        没有继承的强转，编译阶段没有问题，但是运行阶段会报错 —— ClassCaseException
        Inter2 i22 = (Inter2) i1;

    }
}

interface Inter1 {
    void m1();
}

interface Inter2 {
    void m2();
}

class Inter implements Inter1 {
    @Override
    public void m1() {
        System.out.println("m1");
    }
}
