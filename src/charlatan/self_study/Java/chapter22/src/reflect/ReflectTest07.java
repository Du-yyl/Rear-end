package reflect;

import java.lang.reflect.Field;

/**
 * 通过反射机制访问Java对象属性
 */
public class ReflectTest07 {
    public static void main(String[] args) throws Exception {
        //老写法
        Student stu = new Student();
        stu.no = 1111;
        System.out.println(stu.no);
        //新写法【使用反射机制】
        //创建对象
        Class c1 = Class.forName("bean.Student");
        Object obj = c1.newInstance();
        //选择要更改的值的属性【可以通过传参的方式指定要使用哪个对象的属性】
        Field f1 = c1.getDeclaredField("no");
        //更改值
        f1.set(obj, 11111);
        Object i = f1.get(obj);
        System.out.println(i);

        /*
        访问私有属性
            这种访问方式依然不能访问私有属性，如果要访问私有属性，要打破封装进行访问
         */
        Object nameObj = c1.newInstance();
        Field f2 = c1.getDeclaredField("name");
        //这里将这个属性改成true，打破封装
        f2.setAccessible(true);
        f2.set(nameObj, "tom");
        Object obj1 = f2.get(nameObj);
        System.out.println(obj1);
    }
}
