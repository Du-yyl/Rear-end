/**
 * time: 2022/4/27 16:23 34
 * ClassName: IfTest01
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class IfTest01 {
    public static void main(String[] args) {
        boolean sex = true;
        if (sex) {
            System.out.println("真");
        } else {
            System.out.println("假");
        }

        /*
        当 if 循环只有一个语句时，可以将大括号进行省略
         */
        if (sex)
            System.out.println("真");
        else
            System.out.println("假");

    }
}
