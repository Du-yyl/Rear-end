package reflect;

/**
 * 获取class的三种方式
 */
public class ReflectTest01 {
    public static void main(String[] args) {
        /*
         * Class.forName()
         * 1、静态方法
         * 2、方法的参数是一个字符串
         * 3、字符串需要一个完整的类名
         * 4、完整类名必须带有包
         * */
        Class c1 = null;
        try {
            c1 = Class.forName("java.lang.String");//c1代表String.class文件
            Class c2 = Class.forName("java.util.Date");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //Java中任何一个对象都有一个方法：getClass（）【在Object中】
        String s = "abc";
        Class x = s.getClass(); //x代表String.Class字节码文件，x代表String类型
        System.out.println(c1 == x);
        //双等号对比的是底层的内存地址，字节码在装载的时候，只装载一份，两个都代表String类型，所以相等


        //java 中任何一种类型，包括基本数据类型，都有.class属性
        Class z = String.class; //代表String类型
        System.out.println(z == x);
    }
}
