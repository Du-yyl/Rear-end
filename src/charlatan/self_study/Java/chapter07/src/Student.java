/**
 * time: 2022/4/30 19:25 29
 * ClassName: Student
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Student {
    private int no;
    private String name;
    private String address;

    public Student() {

    }

    public Student(int num, String str1, String str2) {
        no = num;
        name = str1;
        address = str2;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int num) {
        no = num;
    }

    public String getName() {
        return name;
    }

    public void setNo(String s) {
        name = s;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String s) {
        address = s;
    }


}
