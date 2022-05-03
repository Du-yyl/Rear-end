/**
 * time: 2022/5/1 16:37 15
 * ClassName: StaticTest04
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class StaticTest04 {
    public static void main(String[] args) {
        User3 u1 = new User3(123,"张三");
        User3 u2 = new User3(321,"李四");
        System.out.println(u1.name);
        u1 = null;
//        使用引用访问类中的数据，可以进行访问，但是底层还是转换为了类名的方式进行的调用，所以不建议这么写
//        因为是底层还是类名的方式进行调用的，所以如果引用为空了，依然不会出现空指针异常
        System.out.println(u1.guoji);
    }
}

class User3{
    int id;
    String name;
    static String guoji = "相同的内容";
    public User3(){

    }
    public User3(int num,String str){
        id = num;
        name = str;
    }
}