/**
 * time: 2022/4/25 18:12 49
 * ClassName: VarTest03
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class VarTest03 {
    //    成员变量
    int num = 400;

    public static void main(String[] args) {
        /*
        作用域问题：
            变量根据出现的位置进行划分：
                在方法体当中声明的变量：局部变量。
                在方法体之外，类体内声明的变量：成员变量。

                重点依据是：声明的位置。
            方法结束声明的变量内存释放，原本定义的区域也就访问不到了
        */
//        局部变量
        int num = 100;

    }

    public static void main1() {
//        这个和 main 方法中数据不同的作用域，不冲突
        int num = 300;
    }
}
