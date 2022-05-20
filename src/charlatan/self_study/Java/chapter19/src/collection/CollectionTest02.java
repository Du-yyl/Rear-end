package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * time :2022/5/10 20:24 35
 * ClassName :CollectionTest02
 * Package :collection
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class CollectionTest02 {
    public static void main(String[] args) {
        /*
        关于 contains ：

         */
        Collection c = new ArrayList();
        c.add(new String("测试"));
        c.add(new String("测试"));
        c.add(new String("测试"));
        c.add(new String("测试"));
        c.add(new String("测试"));
        System.out.println(c.contains(new String("测试")));

        c.remove(new String("测试"));
        System.out.println(c.size());
    }
}
