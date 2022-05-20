package Number;

import java.math.BigDecimal;

/**
 * time :2022/5/9 17:43 56
 * ClassName :NumberTest02
 * Package :Number
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class NumberTest02 {
    public static void main(String[] args) {
        /*
        BigDecimal
            属于大数据，不属于基本数据类型，数据引用数据类型
            负责财务相关的数据
         */
        BigDecimal bd1 = new BigDecimal(20);
        BigDecimal bd2 = new BigDecimal(3);

        BigDecimal bd3 = bd1.add(bd2);
        BigDecimal bd4 = bd1.divide(bd2);

        System.out.println(bd3);
        System.out.println(bd4);
        double d1 = 1.2;
        double d2 = 1;
        System.out.println(d1 + d2 / 3);
    }
}
