package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 反射属性Field【翻译为属性/成员】
 */
public class ReflectTest05 {
    public static void main(String[] args) throws ClassNotFoundException {
//        获取指定类的 Class
        Class c = Class.forName("bean.Student");
        System.out.println(c.getName());//获取名字
        System.out.println(c.getSimpleName());//获取简易名字
        System.out.println(c);
//        获取指定 Class 的所有公开的属性
        Field[] fields = c.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
//        获取指定 Class 所有属性（包括私有属性）
        Field[] fields1 = c.getDeclaredFields();
        for (Field field : fields1) {
            /*
            每一个属性都可以代表一个 Field 对象
            getModifiers()  获取修饰符，返回值是一个数字【这个数字代表不同的修饰符】
                如何将数字转换为字符串？
                    使用 Modifier 中的 toString 方法，这个方法是静态的，并且传入一个数字通过这个数字进行
                    对应的转换完成转换的操作
            getType()       获取对应的类型
            getName()       获取对应属性的名字
             */

            System.out.println(Modifier.toString(field.getModifiers()) + " " + field.getType() + " " + field.getName());
        }
    }
}
