/**
 * time :2022/5/6 22:05 09
 * ClassName :HashCodeTest01
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class HashCodeTest01 {
    public static void main(String[] args) {
        Object o = new Object();
        int hashCodeValue = o.hashCode();

        // 对象内存地址经过哈希算法转换的一个数字。可以等同看做内存地址。
        System.out.println(hashCodeValue); //798154996

        MyClass mc = new MyClass();
        int hashCodeValue2 = mc.hashCode();
        System.out.println(hashCodeValue2); //1392838282

        MyClass mc2 = new MyClass();
        System.out.println(mc2.hashCode()); // 523429237
    }
}

class MyClass {
}
