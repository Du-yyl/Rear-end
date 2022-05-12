package Map;

import java.util.*;

/**
 * time :2022/5/12 10:41 26
 * ClassName :MapTest01
 * Package :Map
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class MapTest01 {
    public static void main(String[] args) {
        /*
        java.util.Map接口中常用的方法：
        1、Map和Collection没有继承关系。
        2、Map集合以key和value的方式存储数据：键值对
            key和value都是引用数据类型。
            key和value都是存储对象的内存地址。
            key起到主导的地位，value是key的一个附属品。
        3、Map接口中常用方法：
            V put(K key, V value) 向Map集合中添加键值对
            V get(Object key) 通过key获取value
            void clear()    清空Map集合
            boolean containsKey(Object key) 判断Map中是否包含某个key
            boolean containsValue(Object value) 判断Map中是否包含某个value
            boolean isEmpty()   判断Map集合中元素个数是否为0
            V remove(Object key) 通过key删除键值对
            int size() 获取Map集合中键值对的个数。
            Collection<V> values() 获取Map集合中所有的value，返回一个Collection

            Set<K> keySet() 获取Map集合所有的key（所有的键是一个set集合）

            Set<Map.Entry<K,V>> entrySet()  将Map集合转换为set集合
                将Map集合转换成Set集合
                假设现在有一个Map集合，如下所示：
                    map1集合对象
                    key             value
                    ----------------------------
                    1               zhangsan
                    2               lisi
                    3               wangwu
                    4               zhaoliu

                    Set set = map1.entrySet();
                    set集合对象
                    1=zhangsan 【注意：Map集合通过entrySet()方法转换成的这个Set集合，Set集合中元素的类型是 Map.Entry<K,V>】
                    2=lisi     【Map.Entry和String一样，都是一种类型的名字，只不过：Map.Entry是静态内部类，是Map中的静态内部类】
                    3=wangwu
                    4=zhaoliu ---> 这个东西是个什么？Map.Entry
        HashMap 底层是一个单向链表

         */
        Map<Integer, String> map = new HashMap<>();
//        添加元素
        map.put(1, "测试1");
        map.put(2, "测试2");
        map.put(3, "测试3");
        map.put(4, "测试4");
        map.put(3, "测试10");
//        查找元素【通过 key 和 value 】
        System.out.println(map.get(2));
//        获取 map 的长度
        System.out.println(map.size());
//        通过 key 删除 value
        map.remove(2);
//        必须匹配才能删除
        map.remove(3, "测试1");
        System.out.println(map.size());

//        判断是否包含指定的元素【底层调用equals】
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("测试4"));
//        获取所有 value
        Collection<String> c = map.values();
//        获取所有的 key
        Set<Integer> keys = map.keySet();

//        清空集合
        map.clear();
//        判断 map 是否为空
        System.out.println(map.isEmpty());
    }
}
