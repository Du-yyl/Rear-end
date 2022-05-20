/**
 * time: 2022/4/26 17:38 27
 * ClassName: OperatorTest01
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class OperatorTest01 {
    public static void main(String[] args) {
        /*
        逻辑运算符：
            &	逻辑与（可以翻译成并且）
            |	逻辑或（可以翻译成或者）
            !	逻辑非（取反）
            &&	短路与
            ||	短路或

        非常重要：
            逻辑运算符两边要求都是布尔类型，并且最终的运算结果也是布尔类型。
            这是逻辑运算符的特点。

            & 两边都是true，结果才是true
            | 有一边是true，结果就是true

        短路与&& 和 逻辑与 &有什么区别？
            首先这两个运算符的运算结果没有任何区别，完全相同。
            只不过“短路与&&”会发生短路现象。
         */
        System.out.println(true & false);
        System.out.println(true & true);
        System.out.println(false & false);

        int num1 = 10;
        int num2 = 20;
//        使用与运算符即使已经有结果了依然会继续进行运算
        System.out.println(num1 > num2 & num1 > num2++);
        System.out.println(num2);

        int x = 10;
        int y = 20;
//        使用或运算，如果已经得到结果，那么就会停止执行
        System.out.println(x > y && x > y++);
        System.out.println(y);
    }
}
