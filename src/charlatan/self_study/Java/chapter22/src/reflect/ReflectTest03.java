package reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReflectTest03 {
    public static void main(String[] args) {
        Properties pro = new Properties();
        FileReader fr = null;
        try {
            fr = new FileReader(".\\src\\charlatan\\self_study\\Java\\chapter22\\src\\classinfo.properties");
            //加载
            pro.load(fr);
            String s = pro.getProperty("className");
            System.out.println(s);

            //通过读配文件，直接创建指定的对象
            Class c = Class.forName(s);
            Object obj = c.newInstance();
            System.out.println(obj);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
