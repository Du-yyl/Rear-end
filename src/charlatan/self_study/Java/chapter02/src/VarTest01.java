/**
 * time: 2022/4/25 16:51 13
 * ClassName: VarTest01
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class VarTest01 {
    public static void main(String[] args) {
        /*
        '' 只能包裹字符型数据，其中存储的数据只能有一个，有两个就报错
            单引号包裹的一定是字符型，双引号包裹的一定是字符串型
         */
        System.out.println(123);
        System.out.println(1.23);
        System.out.println('a');
        System.out.println("你好");
        System.out.println(true);
        System.out.println(false);
    }
}
