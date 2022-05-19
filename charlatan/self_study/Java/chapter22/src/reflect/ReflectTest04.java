package reflect;

/**
 * Class.forName（）发生了什么
 */
public class ReflectTest04 {
    public static void main(String[] args) throws ClassNotFoundException {
        //Class.forName()方法的执行会导致：类加载
        //如果只希望一个类的静态代码块执行，其他东西一律不执行，可以采用这种方式：
        //Class.forName(完整类名)
        //这个方法的执行会导致类加载，类加载时，静态代码块执行
        Class.forName("reflect.test04");
    }
}

class test04 {
    //静态代码块执行，并且只执行一次
    static {
        System.out.println("你好，世界");
    }
}
