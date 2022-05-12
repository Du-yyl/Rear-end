package Map;

import java.util.Objects;
import java.util.TreeSet;

/**
 * time :2022/5/12 19:54 38
 * ClassName :TreeTest02
 * Package :Map
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class TreeTest02 {
    public static void main(String[] args) {
        /*
        自定义的一个类，需要重写规则，反之会出现类型转换异常
        如果TreeSet是无参构造，他的比较器是 null
         */
        Student s1 = new Student("54321");
        Student s2 = new Student("4321");
        Student s3 = new Student("321");
        Student s4 = new Student("21");
        TreeSet<Student> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        for (Student t : ts) {
            System.out.println(t.name);
        }
    }
}

class Student implements Comparable<Student> {
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    /**
     * 实现 Comparable 接口，编写比较的逻辑
     *
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

}
