package Homework;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * time :2022/5/12 21:46 39
 * ClassName :Homework2
 * Package :Homework
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Homework2 {
    public static void main(String[] args) {
        /*
        3.分别用Comparable和Comparator两个接口对下列四位同学的成绩做降序排序，如果成绩一样，
        那在成绩排序的基础上按照年龄由小到大排序。

        姓名（String）年龄（int）分数（float）
        "liusan"			20				90.0F
        "lisi"			22				90.0F
        "wangwu"			20				99.0F
        "sunliu"			22				100.0F

        编写一个Student类用来实现Comparable<Student>接口,并在其中重写CompareTo(Student o)方法　
        在主函数中使用Comparable 与 Comparetor分别对ArrayList进行排序.
         */
        Student s1 = new Student("liusan", 20, 90.0F);
        Student s2 = new Student("lisi", 22, 90.0F);
        Student s3 = new Student("wangwu", 20, 99.0F);
        Student s4 = new Student("sunliu", 22, 100.0F);

        TreeSet<Student> stu = new TreeSet<>(new CompareStudent());
//        TreeSet<Student> stu = new TreeSet<>();
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        stu.add(s4);
        for (Student student : stu) {
            System.out.println(student);
        }
    }
}

class Student {
    //class Student implements Comparable<Student> {
    private String name;
    private int age;
    private Float score;

    public Student(String name, int age, Float score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public Float getScore() {
        return score;
    }

//    /**
//     * 如果年龄相等，比较成绩，反之比较年龄
//     *
//     * @param o the object to be compared.
//     * @return
//     */
//    @Override
//    public int compareTo(Student o) {
//        if (age == o.age) {
//            return (int) (score - o.score);
//        } else {
//            return age - o.age;
//        }
//    }

    @Override
    public String toString() {
        return "名字='" + name + '\'' +
                ", 年龄=" + age +
                ", 成绩=" + score;
    }
}

/**
 * 通过实现指定的类
 */
class CompareStudent implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge() == o2.getAge()) {
            return (int) (o1.getScore() - o2.getScore());
        } else {
            return o1.getAge() - o2.getAge();
        }
    }
}
