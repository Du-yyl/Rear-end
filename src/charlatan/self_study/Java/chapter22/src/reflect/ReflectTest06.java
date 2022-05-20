package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 反编译
 */
public class ReflectTest06 {
    public static void main(String[] args) throws Exception {
        Class c1 = Class.forName("java.lang.String");
        System.out.println(Modifier.toString(c1.getModifiers()) + " class " + c1.getSimpleName() + " {" + '\n');
        Field[] field = c1.getDeclaredFields();
        for (Field fields : field) {
            System.out.println("   " + Modifier.toString(fields.getModifiers()) +
                    " " + fields.getType().getSimpleName() + " " + fields.getName() + ";");
        }
        System.out.println("}");
    }
}
