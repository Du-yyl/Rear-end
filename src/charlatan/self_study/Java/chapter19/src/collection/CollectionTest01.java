package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * time :2022/5/10 19:19 51
 * ClassName :collection.CollectionTest01
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class CollectionTest01 {
    /*
    关于 java.util.collection:
    1、Collection中能存放什么元素？
        没有使用“泛型”之前，Collection中可以存储Object的所有子类型。
        使用了“泛型”之后，Collection中只能存储某个具体的类型。
        [集合中不能直接存储基本数据类型，也不能存储Java对象，存储的内容是Java对象的内存地址]
    2、Collection中的常用方法
        boolean add(Object e) 向集合中添加元素
        int size()  获取集合中元素的个数
        void clear() 清空集合
        boolean contains(Object o) 判断当前集合中是否包含元素o，包含返回true，不包含返回false
        boolean remove(Object o) 删除集合中的某个元素。
        boolean isEmpty()  判断该集合中元素的个数是否为0
        Object[] toArray()  调用这个方法可以把集合转换成数组。【作为了解，使用不多。】
     */
    public static void main(String[] args) {
        // 使用 Collection 引用指向子类型 ArrayList 对象
        Collection c = new ArrayList();
//        自动装箱
        c.add(12);
        c.add(129);
        c.add(new Object());
        System.out.println(c.size());
        System.out.println(c.contains(129));
        c.remove(12);
        c.remove(1);
        c.remove(100);
        c.remove(1000);
        System.out.println(c.size());
        c.clear();
    }
}
