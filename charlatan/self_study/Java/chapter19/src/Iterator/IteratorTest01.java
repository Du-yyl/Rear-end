package Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * time :2022/5/10 19:59 56
 * ClassName :Itrator
 * Package :Iterator
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class IteratorTest01 {
    public static void main(String[] args) {
        /*
        这种迭代器方式是在 Collection 中通用的方式，在Map中不能使用
         */
        Collection c = new ArrayList();
        c.add(123);
        c.add(124);
        c.add(125);
        c.add(126);
        c.add(127);
        c.add(128);
        c.add(129);
        c.add(120);
        Iterator it = c.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
