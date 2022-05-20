package Random;

import java.util.Random;

/**
 * time :2022/5/9 17:58 44
 * ClassName :RandomTest01
 * Package :Random
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class RandomTest01 {
    public static void main(String[] args) {
//        创建随机数对象
        Random rd = new Random();
//        产生一个随机数
        int num = rd.nextInt();
//        产生一个 100 以内的随机数，不会超过 101 ，范围在 0 ~ 100
        int num1 = rd.nextInt(101);

        System.out.println(num);
        System.out.println(num1);
    }
}
