/**
 * time: 2022/4/28 20:11 40
 * ClassName: RecursionTest01
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class RecursionTest01 {
    public static void main(String[] args) {
        System.out.println(addNum(5));
    }

    public static int addNum(int num) {
        if (num == 1) {
            return 1;
        }
        return num + addNum(--num);
    }
}
