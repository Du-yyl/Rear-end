/**
 * time :2022/5/6 22:25 48
 * ClassName :InnerTest01
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class InnerTest01 {
    public static void main(String[] args) {
        Computed1 c1 = new Computed1() {
            @Override
//            实现了接口中的方法，不需要使用单独的类去进行类的定义了
            public int sum(int a, int b) {
                return a + b;
            }
        };
        Test1 t = new Test1();
        System.out.println(t.sum(c1, 1, 1));
    }
}

interface Computed1 {
    int sum(int a, int b);
}

class Test1 {
    public int sum(Computed1 computed, int x, int y) {
//        让传入的对象去实现指定的方法
        return computed.sum(x, y);
    }
}
