package reflect;

/**
 * 关于路径
 */
public class AboutPath {
    public static void main(String[] args) {
        //这种路径的缺点：移植性差，只能在IDEA中确保正确运行
//        File file = new File("chapter3/classinfo.properties");

        //通用方式（代码换位置也可以用）【但是文件要在类路径下】

        /*
         * Thread.currentThread()    当前线程对象
         * getContextClassLoader()   是线程对象的方法，可以获取当前线程的类加载器对象
         * getResource("")   【获取资源】这是类加载器对象的方法，当前线程的类加载器默认从类的根目录下加载资源
         *                       这种方式的根目录是 src ，必须从 src 下开始进行书写
         * */
        String path = Thread.currentThread().getContextClassLoader().
                getResource("classinfo.properties").getPath();
        System.out.println(path);


        String path1 = Thread.currentThread().getContextClassLoader().
                getResource("reflect/AboutPath.class").getPath();
        System.out.println(path1);

        String path2 = Thread.currentThread().getContextClassLoader().getResource("reflect/ Student.class").getPath();
        System.out.println(path2);

    }
}
