package Homework;

import java.util.*;

/**
 * time :2022/5/12 21:59 19
 * ClassName :Homework03
 * Package :Homework
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Homework03 {
    public static void main(String[] args) {
        /*
        6.定义一个泛型为String类型的List集合，统计该集合中每个字符
        （注意，不是字符串）出现的次数。例如：集合中有”abc”、”bcd”两个元素，
        程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”。
         */
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("bcd");
        Map<Character, Integer> map = new HashMap<>();
        for (String s : list) {
            for (char c : s.toCharArray()) {
                if (map.get(c) == null) {
                    map.put(c, 1);
                } else {
                    map.put(c, map.get(c) + 1);
                }
            }
        }
        Set<Map.Entry<Character, Integer>> set = map.entrySet();
        for (Map.Entry<Character, Integer> characterIntegerEntry : set) {
            System.out.println(characterIntegerEntry);
        }
    }
}
