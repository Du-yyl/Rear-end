package Map;

import java.util.TreeSet;

/**
 * time :2022/5/12 19:49 44
 * ClassName :TreeTest01
 * Package :Map
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class TreeTest01 {
    public static void main(String[] args) {
        /*
        1、TreeSet集合底层实际上是一个TreeMap
        2、TreeMap集合底层是一个二叉树。
        3、放到TreeSet集合中的元素，等同于放到TreeMap集合key部分了。
        4、TreeSet集合中的元素：无序不可重复，但是可以按照元素的大小顺序自动排序。
        称为：可排序集合。
         */
        TreeSet<String> tree = new TreeSet<>();
        tree.add("cba");
        tree.add("abc");
        tree.add("acb");
        tree.add("bac");
        for (String s : tree) {
            System.out.println(s);
        }

        TreeSet<Integer> it = new TreeSet<>();
        it.add(9);
        it.add(8);
        it.add(7);
        it.add(6);
        it.add(5);
        it.add(4);
        it.add(3);
        for (Integer integer : it) {
            System.out.println(integer);
        }
    }
}
