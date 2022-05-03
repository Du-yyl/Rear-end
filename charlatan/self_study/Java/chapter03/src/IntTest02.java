/**
 * time: 2022/4/25 21:02 18
 * ClassName: IntTest02
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class IntTest02 {
    public static void main(String[] args) {
        /*
            在常规定义中，数字类型默认会当作 int 类型进行处理，如果希望这个内容被当作 long 类型处理
            需要在数字后面添加 l/L 建议使用 L
         */
//        小容量可以自动类型转换为大容量，【自动类型转换】
        long num1 = 100;
        int num2 = 200;

//        将 int 的最大值进行赋值，存在类型转换
        long num3 = 2147483647;
//        必须先进行类型转换，因为已经超过 int 类型的最大值，需要转换为 long 类型才嫩正确进行赋值
        long num4 = 2147483648L;
        System.out.println(num3 + 2);
    }
}
