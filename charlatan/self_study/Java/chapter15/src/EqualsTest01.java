import java.util.Objects;

/**
 * time :2022/5/6 19:04 58
 * ClassName :EqualsTest01
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class EqualsTest01 {
    public static void main(String[] args) {
        /*
        源代码：
            public boolean equals(Object anObject) {
                if (this == anObject) {
                    return true;
                }
                if (anObject instanceof String) {
                    String aString = (String)anObject;
                    if (!COMPACT_STRINGS || this.coder == aString.coder) {
                        return StringLatin1.equals(value, aString.value);
                    }
                }
                return false;
            }

         */
        String str1 = "测";
        String str2 = "测";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        Test01 t1 = new Test01();
        Test01 t2 = new Test01();
        System.out.println(t1.equals(t2));
    }
}

class Test01 {
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public Test01(int i) {
        this.i = i;
    }

    public Test01() {
    }

    @Override
    public boolean equals(Object o) {
//        如果内存地址相等，那么这两个内容是同一个内容，直接返回相等
        if (this == o) return true;
//        如果传入的内容是 null 或者 两个对比的类是两个不同的类，那么直接返回 false
        if (o == null || getClass() != o.getClass()) return false;
//        如果能运行到这里，那么可以认为两个类是一样的，直接进行转型
        Test01 test01 = (Test01) o;
//        返回这个对象中内存的判断结果
        return i == test01.i;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i);
    }
}
