/**
 * time :2022/5/10 00:02 27
 * ClassName :ExceptionTest08
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ExceptionTest08 {
    public static void main(String[] args) {
        /*
        面试题
         */
        int result = m();
        System.out.println(result);
    }

    private static int m() {
        int i = 100;
        try {
            return i;
        } finally {
            i++;
        }
    }
}
