package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * time :2022/5/12 18:43 25
 * ClassName :HashMapTest01
 * Package :Map
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class HashMapTest01 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "测试1");
        map.put(2, "测试2");
        map.put(3, "测试3");
        map.put(4, "测试4");
//        key 重复的时候，value 自动覆盖
        map.put(2, "测试5");
        System.out.println(map.size());
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for (Map.Entry<Integer, String> entry : set) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
}
