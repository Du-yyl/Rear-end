package Map;

import java.util.*;

/**
 * time :2022/5/12 11:18 54
 * ClassName :MapTest02
 * Package :Map
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class MapTest02 {
    public static void main(String[] args) {
        /*
        Map集合的遍历
         */
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "测试1");
        map.put(2, "测试2");
        map.put(3, "测试3");
        map.put(4, "测试4");
        map.put(5, "测试5");
        map.put(6, "测试6");
//      先获取一个 Map 中所有的 Keys 再通过遍历，通过 key 获取到所有的 value
        Set<Integer> keys = map.keySet();
        for (Integer key :
                keys) {
            System.out.println(key + ", " + map.get(key));
        }
        System.out.println("--------------------");
//        使用 forEach
        map.forEach(((integer, string) -> {
            System.out.println(integer + ", " + string);
        }));
        System.out.println("---------------------");
//        map.entrySet 获取所有的 Key ， 通过 key 遍历所有的 Value
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
        System.out.println("-------------------------------");
//        使用迭代器
        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            System.out.println(next + ", " + map.get(next));
        }

        System.out.println("---------------------");
//        通过直接获取所有的 value 进行全部内容的遍历
        Collection<String> values = map.values();
        for (String string : values) {
            System.out.println(string);
        }
    }
}
