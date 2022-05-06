/**
 * time :2022/5/6 18:49 28
 * ClassName :ToStringTest01
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ToStringTest01 {
    /*
    源代码：
        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
     */
    public static void main(String[] args) {
        ToStringTest01 tst = new ToStringTest01();
        System.out.println(tst.getClass().getName());
    }
}
