package Map;

import java.util.Properties;

/**
 * time :2022/5/12 19:44 41
 * ClassName :PropertiesTest01
 * Package :Map
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class PropertiesTest01 {
    public static void main(String[] args) {
        /*
        Properties是一个Map集合，继承Hashtable，Properties的key和value都是String类型。
        Properties被称为属性类对象。
        Properties是线程安全的。
         */
        Properties pro = new Properties();
        pro.setProperty("测试", "测试");
        pro.setProperty("测试1", "测试1");
        pro.setProperty("测试2", "测试2");
        pro.setProperty("测试3", "测试3");

        System.out.println(pro.get("测试"));
        System.out.println(pro.get("测试1"));
        System.out.println(pro.get("测试2"));
        System.out.println(pro.get("测试3"));
    }
}
