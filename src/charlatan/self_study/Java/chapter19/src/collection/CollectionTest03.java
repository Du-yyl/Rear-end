package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * time :2022/5/11 17:04 36
 * ClassName :ColloectionTest03
 * Package :collection
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class CollectionTest03 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
//        当集合中的内容发生改变，迭代器必须重新获取，不然调用 next（） 方法会出现异常
//        迭代过程中，不能使用 remove 方法，
        Iterator it = c.iterator();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        it = c.iterator();
        while (it.hasNext()) {
            /*
            当创建一个迭代器的时候，会获取此时的集合的快照，在迭代的过程中如果删除某一个元素，
            发现集合中的原始内容和快照中的内容不相同，会直接抛出异常，
            所以，使用集合中的方法删除元素会直接报错，
            但是如果使用迭代器去删除，会将迭代器中的内容同步更新，二者还是相同的，所以不报错
             */
            Object obj = it.next();
//            使用迭代器提供的 remove 方法，删除时可以，并且运行迭代结束后，集合中元素数据为 0
            it.remove();
//            使用集合中的 remove 方法，删除元素的时候会要重新进行迭代器的获取，不更新迭代器直接爆出异常
            c.remove(obj);
            System.out.println(obj);
        }
    }
}
