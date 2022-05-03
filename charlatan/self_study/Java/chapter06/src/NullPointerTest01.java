import java.lang.reflect.Constructor;

/**
 * time: 2022/4/30 16:23 06
 * ClassName: NullPointerTest01
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class NullPointerTest01 {
    public static void main(String[] args) {
        User u = new User();
        u.id = 20;
        System.out.println(u.id);
        u = null;
        System.out.println(u.id);

    }
}
class User{
    int id;
}