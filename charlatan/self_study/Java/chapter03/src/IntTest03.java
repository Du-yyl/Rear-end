/**
 * time: 2022/4/25 21:13 38
 * ClassName: IntTest03
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class IntTest03 {
    public static void main(String[] args) {
        /*
        强制类型转换：
            大容量转换为小容量称为强制类型转换
        进行强转时，直接将 long 的8个字节中前4个直接砍掉，砍掉的过程中可能会损失精度
         */
        long num1 = 100;
        int num2 = (int) num1;
        System.out.println(num2);
    }
}
