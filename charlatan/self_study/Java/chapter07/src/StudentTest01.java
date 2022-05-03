/**
 * time: 2022/4/30 19:30 26
 * ClassName: StudentTest01
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class StudentTest01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(1,"张三","背景");
        System.out.println(s1.getName());
        s1.setNo(100);
        System.out.println(s1.getNo());

        s2.setNo(2000);
        System.out.println(s2.getNo());
    }
}
