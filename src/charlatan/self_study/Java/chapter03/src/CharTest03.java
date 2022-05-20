/**
 * time: 2022/4/25 21:38 36
 * ClassName: CharTest03
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class CharTest03 {
    public static void main(String[] args) {
        /*
        第一个结论：
            当一个整数赋值给char类型变量的时候，会自动转换成char字符型，最终的结果是一个字符。

		第二个结论：
		    当一个整数没有超出byte short char的取值范围的时候，这个整数可以直接赋值给byte short char类型的变量。
         */
        char char1 = 98;
        char char2 = 65535;
        System.out.println(char1);
        System.out.println(char2);
    }
}
