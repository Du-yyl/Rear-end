package reflect;

import java.lang.reflect.Constructor;

/**
 * 反射机制调用构造方法
 */
public class ReflectTest11 {
    public static void main(String[] args) throws Exception {
        Class c1 = Class.forName("com.bjpowernode.java.reflect.Student");
        //无参构造
        Object obj = c1.newInstance();
        System.out.println(obj);
        //传入数字，字符串【通过Class.Constructor进行选择构造方法】
//        第一个参数可以换一个指定方法的方法名，进行指定调用
        Constructor c = c1.getDeclaredConstructor(int.class, String.class);
        //返回的值是Object
        //Method loginMethod = userServiceClass.getDeclaredMethod("login", int.class);
        // 调用方法
        // 调用方法有几个要素？ 也需要4要素。
        // 反射机制中最最最最最重要的一个方法，必须记住。
        /*
        四要素：
        loginMethod方法
        obj对象
        "admin","123" 实参
        retValue 返回值
         */
//        调用对应的方法
        Object obj1 = c.newInstance(10, "张三");
        System.out.println(obj1);
    }
}
