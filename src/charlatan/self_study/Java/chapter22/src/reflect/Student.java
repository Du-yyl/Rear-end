package reflect;

public class Student {
    int no;
    String name;
    String birth;
    boolean sex;

    public Student(int no, String name, String birth, boolean sex) {
        this.no = no;
        this.name = name;
        this.birth = birth;
        this.sex = sex;
    }

    public Student(int no, String name, String birth) {
        this.no = no;
        this.name = name;
        this.birth = birth;
    }

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public Student(int no) {
        this.no = no;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", sex=" + sex +
                '}';
    }

    public int doOther(int i) {
        return i;
    }
}
