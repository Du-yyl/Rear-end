/**
 * time :2022/5/6 22:09 01
 * ClassName :InneTest
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class InnerTest {
    //    这个类在类的内部，称为内部类
//    有 static 被称为静态内部类
    public static class Inner {

    }

    class Inner1 {

    }


    public static void main(String[] args) {
//        局部内部类
        class Inner2 {
        }

        Computed computed = new ComputedIml1();
        Computed computed1 = new ComputedIml2();
        Test t = new Test();
        System.out.println(t.sum(computed, 1, 2));
        System.out.println(t.sum(computed1, 1, 2));
    }
}

interface Computed {
    int sum(int a, int b);
}

class ComputedIml1 implements Computed {
    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}

class ComputedIml2 implements Computed {
    @Override
    public int sum(int a, int b) {
        return a * b;
    }
}

class Test {
    public int sum(Computed computed, int x, int y) {
//        让传入的对象去实现指定的方法
        return computed.sum(x, y);
    }
}
