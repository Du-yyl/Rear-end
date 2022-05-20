/**
 * time: 2022/5/1 15:57 16
 * ClassName: StaticTest03
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class StaticTest03 {
    public static void main(String[] args) {
        User2 u1 = new User2(123, "张三");
        User2 u2 = new User2(321, "李四");
        System.out.println(u1.name);
        System.out.println(u1.guoji);
    }

}

class User2 {
    int id;
    String name;
    static String guoji = "重复的测试内容";


    public User2() {

    }

    public User2(int num, String str1) {
        id = num;
        name = str1;
    }

}
