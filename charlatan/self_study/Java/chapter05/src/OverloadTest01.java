/**
 * time: 2022/4/28 16:51 25
 * ClassName: OverloadTest01
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class OverloadTest01 {
    public static void main(String[] args) {
        /*
        方法的重载（方法重写）
         */
        System.out.println(sam(1,2));
        System.out.println(sam(1.2,2.4));
        System.out.println(sam(1L,2L));
    }

    public static int sam(int x, int y) {
        return x + y;
    }

    public static long sam(long x, long y) {
        return x + y;
    }

    public static double sam(double x, double y) {
        return x + y;
    }

}
