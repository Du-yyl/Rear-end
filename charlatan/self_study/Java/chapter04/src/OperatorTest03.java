/**
 * time: 2022/4/26 18:20 32
 * ClassName: OperatorTest03
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class OperatorTest03 {
    public static void main(String[] args) {
        /*
        位运算
                A = 0011 1100
                B = 0000 1101
            ＆	    如果相对应位都是1，则结果为1，否则为0	                                    （A ＆ B） 得到 12，即 0000 1100
            |	    如果相对应位都是 0，则结果为 0，否则为 1 	                                （A | B） 得到 61，即 0011 1101
            ^	    如果相对应位值相同，则结果为0，否则为1	                                    （A ^ B） 得到 49，即 0011 0001
            〜	    按位取反运算符翻转操作数的每一位，即0变成1，1变成0。	                        （〜 A） 得到 -61，即 1100 0011
            << 	    按位左移运算符。左操作数按位左移右操作数指定的位数。	                        A << 2 得到 240，即 1111 0000
            >> 	    按位右移运算符。左操作数按位右移右操作数指定的位数。	                        A >> 2 得到 15，即 1111
            >>> 	按位右移补零操作符。左操作数的值按右操作数指定的位数右移，移动得到的空位以零填充。	A >>> 2 得到 15，即 0000 1111
         */
        int num1 = 1024 ;
        int num2 = 10;
        /*
        5   0000 0101
        3   0000 0011
         */
//        如果对应都是 1 ，那么就是 1 ，反之是 0 —— 0000 0001
        System.out.println(num1 & 3);
//        如果对应都是 0 ，那么就是 0 ，反之是 1 —— 0000 0111
        System.out.println(num1 | 3);
//        如果对应位相同，结果是 0 ，反之是 1 —— 0000 0110
        System.out.println(num1 ^ 3);
//        所有位内容全部取反 —— 1111 1010
        System.out.println(~num1);
//        向左位移指定位数
        System.out.println(num1 << 2);
//        向右位移指定位数
        System.out.println(num1 >> 2);
//        右移补0
        System.out.println(num1 >>> 2);
    }
}
