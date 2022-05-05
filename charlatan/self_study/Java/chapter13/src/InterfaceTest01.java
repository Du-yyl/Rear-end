/**
 * time: 2022/5/5 19:49 15
 * ClassName: InterfaceTest01
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class InterfaceTest01 {
    public static void main(String[] args) {
        /*
        接口
            接口是一种“引用数据类型”，编译之后也生成 class 字节码文件
            接口是完全抽象的（抽象类是半抽象的）
            接口支持多继承，一个接口可以继承多个接口
            一个接口中只有两部分内容，一个是常量，一个是抽象方法，没有其他内容了
            接口中所有的元素都是 public 修饰的，定义方法时，public abstract 可以省略不写
            接口方法不能带有方法体
         */

    }
}

// 定义一个接口
interface D {
}

interface E extends D {
}

// 一个接口可以继承多个接口，实现多继承
interface F extends E, D {
}

interface Interface {
    //    接口中可以定义一个常量
    public static final int PUBLIC_NUM = 123;
    //    接口所有变量，所以常量的 public static final 可以省略
    String PUBLIC_STR = "固定字符串";

    //    定义一个要实现的方法
    public abstract void doSome();

    //    public abstract 可以省略不写
    void doOther(int num1, int num2);
}

class Test implements Interface {

    public void doSome() {
        System.out.println(PUBLIC_NUM);
    }

    public void doOther(int sd, int df) {
    }
}
