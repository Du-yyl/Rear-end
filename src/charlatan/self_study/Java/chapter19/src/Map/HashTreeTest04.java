package Map;

import java.util.TreeSet;

/**
 * time :2022/5/12 20:21 03
 * ClassName :HashTreeTest04
 * Package :Map
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class HashTreeTest04 {
    public static void main(String[] args) {
        Person s1 = new Person(1, "d");
        Person s2 = new Person(2, "c");
        Person s3 = new Person(3, "b");
        Person s4 = new Person(2, "a");
        Person s5 = new Person(3, "c");
        TreeSet<Person> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        for (Person t : ts) {
            System.out.println(t);
        }
    }
}

class Person implements Comparable<Person> {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * 重写比较的方法，同时比较 id 和 name
     * - 如果返回值小于 0 ，会在左子树上找
     * - 如果返回值大于 0 ，会在右子树上找
     * - 如果返回值等于 0 ，会替换这个元素
     *
     * @param o the object to be compared.
     * @return 返回的是一个数字，决定放在哪个位置
     */
    @Override
    public int compareTo(Person o) {
        if (id == o.id)
            return name.compareTo(o.name);
        else
            return id - o.id;
    }
}
