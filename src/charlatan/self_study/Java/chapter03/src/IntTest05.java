/**
 * time: 2022/4/25 21:56 18
 * ClassName: IntTest05
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class IntTest05 {
    public static void main(String[] args) {
//        byte、char、short做混合运算的时候，各自先转换成int再做运算。
        byte byte1 = 10;
        char char1 = 'a';
        short short1 = 30;
        System.out.println(byte1 + char1);
        System.out.println(byte1 + char1 + short1);

//        多种混合数据混合运算的时候，会自动按照最大的容量对应的类型进行处理
        long Long = 10L;
//        这个最终会转换为 Long 类型，因为容量最大的是 Long 类型
        System.out.println(Long + byte1 + char1 + short1);

    }
}
