package String;

/**
 * time :2022/5/8 18:14 37
 * ClassName :StringTest02
 * Package :String
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class StringTest02 {
    public static void main(String[] args) {
        /*
        这里创建了一个新的对象，并且内容跟也是一个字符串，这个字符串内容也保存在字符串常量池中，并且将内存地址的引用
        指向了创建出的内存地址中
         */
        User u1 = new User(1, "张三");
        /*
        当创建第二个对象时，因为声明的字符串是相同的，所以直接引用的是字符串常量池中的内容，
        这两个新建的对象中的 name 属性保存的是方法区内存的对应字符串的内存地址，二者在堆内存中保存的内存地址一样
        所以如果使用双等号进行判断，二者的结果依然是相等的
         */
        User u2 = new User(2, "张三");
        System.out.println(u1.name == u2.name);
    }
}

class User {
    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
