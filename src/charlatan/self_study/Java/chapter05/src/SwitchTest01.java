import java.util.Scanner;

/**
 * time: 2022/4/27 16:44 57
 * ClassName: SwitchTest01
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class SwitchTest01 {
    public static void main(String[] args) {
        /*
        在老版本的JDK中是不支持字符串类型中对比的，只支持数字类型，并且还是int类型的对比
        JDK 13中加入了字符串类型的支持
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入【0-6】数字");
        int num = scanner.nextInt();
        // 这段程序中通过输入的对比，如果对比成功就走指定的分支，并且对比的方式就是直接使用 ‘ == ’ 进行对比
        switch (num) {
            case 0:
                System.out.println("周日");
                break;
            case 1:
                System.out.println("周一");
                break;
            case 2:
                System.out.println("周二");
                break;
            case 3:
                System.out.println("周三");
                break;
            case 4:
                System.out.println("周四");
                break;
            case 5:
                System.out.println("周五");
                break;
            case 6:
                System.out.println("周六");
                break;
        }
        // case穿透现象
        // 【如果在 case 语句之间不使用 break 会出现 case 穿透现象 ， 如果匹配并且没有 break ，那么就会继续进行下面语句的执行，不再进行对比
//        直到遇到 break 语句为止
        switch (num) {
            case 0:
                System.out.println("周日");
            case 1:
                System.out.println("周一");
            case 2:
                System.out.println("周二");
            case 3:
                System.out.println("周三");
            case 4:
                System.out.println("周四");
                break;
            case 5:
                System.out.println("周五");
                break;
            case 6:
                System.out.println("周六");
                break;
        }
//         关于default语句
//        如果所有的语句都没有匹配上就会指定，default 语句就会执行1
        switch (num) {
            case 0:
                System.out.println("周日");
                break;
            case 1:
                System.out.println("周一");
                break;
            case 2:
                System.out.println("周二");
                break;
            case 3:
                System.out.println("周三");
                break;
            case 4:
                System.out.println("周四");
                break;
            case 5:
                System.out.println("周五");
                break;
            case 6:
                System.out.println("周六");
                break;
            default:
                System.out.println("你输入尼玛呢");
        }
        /*
        关于case合并
            如果多个条件要使用同一个条件，那么就会可以使用 case 合并，将多个 case 合并成一个语句
         */
        switch (num) {
            case 0:
            case 1:
            case 2:
                System.out.println("周日");
                break;
            case 3:
                System.out.println("周三");
                break;
            case 4:
                System.out.println("周四");
                break;
            case 5:
                System.out.println("周五");
                break;
            case 6:
                System.out.println("周六");
                break;
            default:
                System.out.println("你输入尼玛呢");
        }
    }
}
