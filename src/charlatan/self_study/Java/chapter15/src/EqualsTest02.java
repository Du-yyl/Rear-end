import java.util.Objects;

/**
 * time :2022/5/6 19:45 15
 * ClassName :EqualsTest02
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class EqualsTest02 {
    public static void main(String[] args) {
        String str1 = new String("测试内容");
        String str2 = new String("测试内容");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}

class Test02 {
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test02 test02 = (Test02) o;
        return Objects.equals(name, test02.name);
//        return name.equals(test02.name);
    }


    public Test02(String name) {
        this.name = name;
    }

    public Test02() {
    }
}
