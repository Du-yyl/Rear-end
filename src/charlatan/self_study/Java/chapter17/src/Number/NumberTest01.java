package Number;

import java.text.DecimalFormat;

/**
 * time :2022/5/9 17:35 59
 * ClassName :NumberTest01
 * Package :Number
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class NumberTest01 {
    public static void main(String[] args) {
        /*
        关于数字的格式化
            DecimalFormat 负责数字格式化
            # 代表任意数字
            , 代表千分位
            . 代表小数点
            0 代表数字不够，补 0
         */
//        这个格式代表，加入千分位，保留两位小数
        DecimalFormat df = new DecimalFormat("###,###.0000");
        double d = 123123123.123;
        String str = df.format(d);
        System.out.println(str);
    }
}
