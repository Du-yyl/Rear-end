package Date;

/**
 * time :2022/5/9 17:02 37
 * ClassName :DateTest02
 * Package :Date
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class DateTest02 {
    public static void main(String[] args) {
//        获取时间戳，底层直接调用 c++ 进行实现
        System.out.println(System.currentTimeMillis());

        long begin = System.currentTimeMillis();
        print();
        // 在执行完目标方法之后记录一个毫秒数
        long end = System.currentTimeMillis();
        System.out.println("耗费时长" + (end - begin) + "毫秒");
    }

    // 需求：统计一个方法执行所耗费的时长
    public static void print() {
        for (int i = 0; i < 1000000000; i++) {
//            System.out.println("i = " + i);
        }
    }
}
