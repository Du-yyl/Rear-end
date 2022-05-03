/**
 * time: 2022/4/25 20:54 27
 * ClassName: IntTest01
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class IntTest01 {
    public static void main(String[] args) {
        /*
        整数型在java语言中共4种类型：
            byte	1个字节  最大值127
            short	2个字节  最大值32767
            int	4个字节  2147483647是int最大值，超了这个范围可以使用long类型。
            long	8个字节

            1个字节 = 8个二进制位
            1byte = 8bit
         */
//        整数类型的表示
//        10 进制
        int num1 = 10;
//        16进制
        int num2 = 0x10;

//        8进制
        int num3 = 010;
//        2进制
        int num4 = 0b10;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);

    }
}
