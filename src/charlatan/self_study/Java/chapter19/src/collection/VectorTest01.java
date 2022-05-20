package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

/**
 * time :2022/5/11 22:11 58
 * ClassName :VectorTest01
 * Package :collection
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class VectorTest01 {
    public static void main(String[] args) {
        /*
        底层是数组；
        初始化容量是：10；
        如何扩容：
            扩容到原容量的二倍
        Vector 是线程安全的
        如何让线程不安全的变成线程不安全的
            使用 Collections 中的方法
         */
        Vector v = new Vector();
        v.add(1);
        v.add(2);
        List list = new ArrayList();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
//        变成线程安全的
        Collections.synchronizedList(list);

    }
}
