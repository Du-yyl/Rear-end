/**
 * time: 2022/4/25 20:29 26
 * ClassName: CharTest02
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class CharTest02 {
    public static void main(String[] args) {
        /*
        转义字符
        \t  制表符
        \n  换行符
        \ u  ascii 转码 转 ascii 转换为中文字符
         */
        char c1 = '\t';
        char c2 = '\b';
        System.out.println(c1);
        System.out.println(c2);
        char c3 = '\u4e1b';
        System.out.println(c3);
    }
}
