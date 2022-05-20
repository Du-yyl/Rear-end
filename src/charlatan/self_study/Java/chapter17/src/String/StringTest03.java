package String;

/**
 * time :2022/5/8 19:15 58
 * ClassName :StringTest03
 * Package :String
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class StringTest03 {
    public static void main(String[] args) {
        /*
        字符串的构造方法
         */
        String str1 = "测试内容";
        byte[] bytes = {97, 98, 99};
        String str3 = new String(bytes);
        System.out.println(str3);

//        传入一个 byte 数组，第二个是偏移量，第三个是要传入的长度【转换一部分的 byte 数组】
        String str4 = new String(bytes, 1, 2);
        System.out.println(str4);

        char[] chars = {'a', 'b', 'c', 'd'};
//        将 char 数组转换成字符串
        String str5 = new String(chars);
//        将数组中的内容进行转换
        String str6 = new String(chars, 2, 2);
        System.out.println(str5);
        System.out.println(str6);
    }
}
