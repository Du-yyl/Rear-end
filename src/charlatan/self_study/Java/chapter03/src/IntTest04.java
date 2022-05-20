/**
 * time: 2022/4/25 21:28 30
 * ClassName: IntTest04
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class IntTest04 {
    public static void main(String[] args) {
        /*
            当这个整数型字面量没有超出byte的取值范围，那么这个
            整数型字面量可以直接赋值给byte类型的变量。
         */
        byte num2 = 1;
        byte num3 = 127;

        short num4 = 32767;

//        精度丢失
//        因为 300 的二进制是：00000000 00000000 00000001 00101100
//        而转换为 byte 直接砍掉了3个，剩下一个也就是 00101100 这个转换为10进制是 44
        byte num1 = (byte) 300;
        System.out.println(num1);
    }
}
