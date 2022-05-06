import java.util.Objects;

/**
 * time :2022/5/6 21:00 48
 * ClassName :EqualsTest03
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class EqualsTest03 {
    public static void main(String[] args) {
        Test03Test t1 = new Test03Test(12, "测试内容");
        Test03Test t2 = new Test03Test(12, "测试内容");
        Test03 test1 = new Test03(20, "测试", t1);
        Test03 test2 = new Test03(20, "测试", t2);

        System.out.println(test1.equals(test2));
    }
}

class Test03 {
    int no;
    String addr;
    Test03Test tt;

    public Test03(int no, String addr, Test03Test tt) {
        this.no = no;
        this.addr = addr;
        this.tt = tt;
    }

    public Test03() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test03 test03 = (Test03) o;
        return no == test03.no && Objects.equals(addr, test03.addr) && Objects.equals(tt, test03.tt);
    }

}

class Test03Test {
    int id;
    String name;

    public Test03Test(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Test03Test() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test03Test that = (Test03Test) o;
        return id == that.id && Objects.equals(name, that.name);
    }

}
