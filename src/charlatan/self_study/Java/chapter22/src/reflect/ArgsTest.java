package reflect;

/**
 * 可变长度参数
 * int...args这就是可变长度参数
 * 语法：类型...    （一定是3个点）
 * <p>
 * 1、可变参数的参数长度要求是  0~n个
 * 2、可变长度参数在参数列表中必须在最后一个，而且只能有一个
 * 3、可变长度参数可以当作数组来看待【也可以传一个数组进去】
 */
public class ArgsTest {
    public static void main(String[] args) {
        doSome(1, 23, 123, 2, 4, 234, 34, 53, 45, 4, 3);
        doSome();
        doOther("nihao ");
        doOther("ceshi ", 23, 34, 34, 34, 3, 4, 34, 2, 43, 4, 34, 3, 4, 3);
        doAny();
        doAny(2, 34, 23, 42, 34, 34, 3, 454, 5, 45, 3, 4);
    }

    public static void doSome(int... args) {
        System.out.println("可变长度参数");
    }

    public static void doOther(String name, int... age) {
        System.out.println("可变长度参数在参数列表中必须在最后一个，而且只能有一个");
    }

    public static void doAny(int... agr) {
        for (int i = 0; i < agr.length; i++) {
            System.out.println(agr[i]);
        }
    }
}
