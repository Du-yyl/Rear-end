package String;

/**
 * time :2022/5/9 14:32 16
 * ClassName :StringBuilderTest
 * Package :String
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        /*
        StringBuffer 和 StringBuilder
            二者功能一样，不过 StringBuffer 是线程安全的，StringBuilder 是非线程安全的
         */
        StringBuilder sb = new StringBuilder();
        sb.append(123);
        sb.append(123);
        sb.append(123);
        sb.append(123);
        System.out.println(sb);
    }
}
