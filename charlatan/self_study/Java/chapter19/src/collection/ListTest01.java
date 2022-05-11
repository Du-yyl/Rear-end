package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * time :2022/5/11 17:50 23
 * ClassName :ListTest01
 * Package :collection
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ListTest01 {
    public static void main(String[] args) {
        /*
        List集合存储元素特点：有序可重复
        有序：List集合中的元素有下标。
        从0开始，以1递增。
        可重复：存储一个1，还可以再存储1.

        List既然是Collection接口的子接口，那么肯定List接口有自己“特色”的方法：
        以下只列出List接口特有的常用的方法：
            void add(int index, Object element)     向指定的下标处添加元素，其他已经有的元素会更换位置
            Object set(int index, Object element)   修改指定下标的内容
            Object get(int index)                   获取指定的下标的内容
            int indexOf(Object o)                   获取指定元素的下标
            int lastIndexOf(Object o)               获取指定元素最后出现的下标
            Object remove(int index)                移除指定下标的内容
         */
        List list = new ArrayList();
        list.add(1);
//        向指定的位置插入元素【并且如果在集合长度不够的时候添加超过集合长度的内容，会直接下标异常】
//        使用不多，效率较低
        list.add(1, "test");
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("--------------------");
        for (int i = 0; i < list.size(); i++) {
//            因为 List 中的元素是有下标的，通过的遍历，获取全部内容【List特有的遍历方式】
            System.out.println(list.get(i));
        }

//
        list.set(1, "测试");
        System.out.println(list.indexOf("测试"));
    }
}
