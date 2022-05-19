package reflect;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class IOproperties {
    public static void main(String[] args) {
        //Thread.currentThread().getContextClassLoader().
        // getResourceAsStream(文件名) 直接返回一个InputStream类型的数据
        InputStream is = Thread.currentThread().getContextClassLoader().
                getResourceAsStream("classinfo2.properties");
        //新建properties对象
        Properties pro = new Properties();
        //加载
        try {
            pro.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //关闭
        pro.clone();
        //直接使用
        System.out.println(pro.getProperty("className"));
    }
}
