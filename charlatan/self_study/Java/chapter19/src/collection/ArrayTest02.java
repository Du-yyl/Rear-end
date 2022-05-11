package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * time :2022/5/11 19:11 08
 * ClassName :ArrayTest02
 * Package :collection
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ArrayTest02 {
    public static void main(String[] args) {
        /*

         */
        List list = new ArrayList();
        List list1 = new ArrayList(20);

        Collection list2 = new HashSet();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
//        构造方法中可以传入一个 Collection 集合，这些元素按照迭代的顺序排列
        List list3 = new ArrayList(list2);
    }
}
