package collection;

import java.util.*;

/**
 * time :2022/5/12 21:14 01
 * ClassName :CollectionsTest01
 * Package :collection
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class CollectionsTest01 {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
//        变成线程安全的
        Collections.synchronizedList(list);
        list.add(new User(5));
        list.add(new User(4));
        list.add(new User(3));
        list.add(new User(2));
        list.add(new User(1));
//        对集合进行排序【需要排序必须实现 Comparable 接口】
        Collections.sort(list);
        for (User user : list) {
            System.out.println(user);
        }

        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(4);
        set.add(3);
        set.add(2);
        set.add(1);
//      将set集合进行转换，将set转换为ArrayList集合
        List<Integer> list1 = new ArrayList<>(set);
        for (Integer integer : list1) {
            System.out.println(integer);
        }
    }
}

class User implements Comparable<User> {
    int id;

    public User(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id=" + id;
    }

    @Override
    public int compareTo(User o) {
        return id - o.id;
    }
}
