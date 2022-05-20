package Integer;

/**
 * time :2022/5/9 14:46 40
 * ClassName :IntegerTest01
 * Package :Integer
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class IntegerTest01 {
    public static void main(String[] args) {
        /*
        1、java中为8种基本数据类型又对应准备了8种包装类型。8种包装类属于引用数据类型，父类是Object。
        2、思考：为什么要再提供8种包装类呢？
            因为8种基本数据类型不够用。
            所以SUN又提供对应的8种包装类型。
         */
        MyInt mi = new MyInt(123);
        System.out.println(mi);
    }

    /**
     * doSome 中需要传入一个对象，但是如果需要传入数字，就不能直接传入数字
     * 这是可以使用数字的包装类，包装一下再传递
     *
     * @param obj
     */
    public static void doSome(Object obj) {

    }
}

/**
 * 模拟一个包装类，参数是 value ，如果调用 toString 方法，那么就能返回对应的原始数据
 */
class MyInt {
    int value;

    public MyInt() {
    }

    public MyInt(int i) {
        this.value = i;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
