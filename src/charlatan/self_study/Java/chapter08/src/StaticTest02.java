/**
 * time: 2022/5/1 15:51 02
 * ClassName: StaticTest02
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class StaticTest02 {
    public static void main(String[] args) {
        /*
        如果所一个对象中所有的内容都是实例化的，那么一些内容相同的内容，会在不同的堆内存中开辟新空间，但是内容都时相同的，从而造成内存占用的增大
         */
        User1 u1 = new User1(123, "张三", "重复的内容");
        User1 u2 = new User1(321, "李四", "重复的内容");

    }
}

class User1 {
    int id;
    String name;
    String guoji;

    public User1() {

    }

    public User1(int num, String str1, String str2) {
        id = num;
        name = str1;
        guoji = str2;
    }

}