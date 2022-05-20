package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * time :2022/5/11 18:39 52
 * ClassName :ArrayListTest01
 * Package :collection
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ArrayListTest01 {
    public static void main(String[] args) {
        /*
        ArrayList ：
            初始化容量是 10【可以通过构造方法传入参数，指定集合长度】；
            底层是一个 Object 数组；
        3、构造方法：
            new ArrayList();
            new ArrayList(20);
        4、ArrayList集合的扩容：
            增长到原容量的1.5倍。
            ArrayList集合底层是数组，怎么优化？
                尽可能少的扩容。因为数组扩容效率比较低，建议在使用ArrayList集合
                的时候预估计元素的个数，给定一个初始化容量。
                底层使用二进制的运算进行扩容，二进制左移二位相当与乘二，右移相反
        5、数组优点：
            检索效率比较高。（每个元素占用空间大小相同，内存地址是连续的，知道首元素内存地址，
            然后知道下标，通过数学表达式计算出元素的内存地址，所以检索效率最高。）
        6、数组缺点：
            随机增删元素效率比较低。
            另外数组无法存储大数据量。（很难找到一块非常巨大的连续的内存空间。）
        7、向数组末尾添加元素，效率很高，不受影响。
        8、面试官经常问的一个问题？
            这么多的集合中，你用哪个集合最多？
                答：ArrayList集合。
                因为往数组末尾添加元素，效率不受影响。
                另外，我们检索/查找某个元素的操作比较多。

        7、ArrayList集合是非线程安全的。（不是线程安全的集合。）
         */
//        默认容量是 10
        List list = new ArrayList();
//        指定容量为 20
        List list1 = new ArrayList(20);
//        获取的是集合中实际的内容容量，不获取集合的容量
        System.out.println(list.size());
    }
}
