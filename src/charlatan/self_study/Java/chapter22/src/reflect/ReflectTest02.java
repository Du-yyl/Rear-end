package reflect;

/**
 * 通过获取Class，实例化对象
 */
public class ReflectTest02 {
    public static void main(String[] args) {
        try {
            Class c1 = Class.forName("bean.user");
            //通过newInstance来调用user这个类的无参数构造方法完成对象的创建
            //newInstance（）是无参构造，必须保证无参构造的存在【如果没有无参构造会出现异常】
            Object obj = c1.newInstance();
            System.out.println(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
