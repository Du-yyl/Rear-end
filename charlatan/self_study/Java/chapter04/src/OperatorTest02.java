/**
 * time: 2022/4/26 18:08 04
 * ClassName: OperatorTest02
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class OperatorTest02 {
    public static void main(String[] args) {
        /*
        赋值运算符
            =、+=、-=、*=、/=、%=、^=、&=、|=、<<=、>>=
        使用扩展赋值运算符的时候，永远都不会改变运算结果类型。
            byte x = 100;
            x += 1;
            x自诞生以来是byte类型，那么x变量的类型永远都是byte。不会变。
            不管后面是多大的数字。

            << =	左移位赋值运算符	C << = 2等价于C = C << 2
            >> =	右移位赋值运算符	C >> = 2等价于C = C >> 2
            ＆=	    按位与赋值运算符	C＆= 2等价于C = C＆2
            ^ =	    按位异或赋值操作符	C ^ = 2等价于C = C ^ 2
            | =	    按位或赋值操作符	C | = 2等价于C = C | 2
         */
        byte num1 = 100;
        num1 += 1;
        System.out.println(num1);
        /*
        +=
            byte num = 100;
            操作可以近似看作是 num = num + 1;
            但是实际是：num = (byte) (num + 1);
            所以扩展原算符永远不会改变元素的类型
         */


    }
}
