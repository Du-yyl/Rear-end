package reflect;

import java.lang.reflect.Method;

/**
 * 通过反射机制调用方法
 */
public class ReflectTest08 {
    public static void main(String[] args) throws Exception {

        //老方法
        Student stu = new Student();
        int q = stu.doOther(1);
        System.out.println(q);
        //新方法
        /*
         * 通过四要素 ；
         *   1、对象
         *   2、方法
         *   3、实参列表
         *   4、接收返回值
         * */
        //先通过Class.forName获取的指定类的Class
        Class classStudent = Class.forName("bean.Student");
        //通过Class新new一个对象
        Object obj = classStudent.newInstance();
        //通过Class.getDeclaredMethod（”指定的方法“，要传入的数据类型）返回一个Method的数据
        Method method = classStudent.getDeclaredMethod("doOther", int.class);
        //通过Method的invoke【调用】方法，来传入调用这个方法的对象，以及参数，通过返回的Object来接收返回值
        Object obj1 = method.invoke(obj, 1);
        System.out.println(obj1);

    }
}
