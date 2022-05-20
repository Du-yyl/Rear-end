package Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * time :2022/5/12 19:28 39
 * ClassName :HashMapTest03
 * Package :Map
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class HashMapTest03 {
    public static void main(String[] args) {
        /*
        Map 中的内容可以是空
        Hashtable的key可以为null吗？
            Hashtable的key和value都是不能为null的。
            HashMap集合的key和value都是可以为null的。

        Hashtable方法都带有synchronized：线程安全的。
        线程安全有其它的方案，这个Hashtable对线程的处理
        导致效率较低，使用较少了。

        Hashtable和HashMap一样，底层都是哈希表数据结构。
        Hashtable的初始化容量是11，默认加载因子是：0.75f
        Hashtable的扩容是：原容量 * 2 + 1
         */
        Map map = new HashMap();
        map.put(null, null);
        map.put(null, 100);
        System.out.println(map.get(null));

        Map<Object, String> map1 = new Hashtable<>();
//        hashtable 中的 key 和 value 都不能为空
        map1.put(null, "测试");
        map1.put(new Object(), null);
    }
}
