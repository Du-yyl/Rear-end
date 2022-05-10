/**
 * time :2022/5/10 00:19 36
 * ClassName :ExceptionTest09
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ExceptionTest09 {
    public static void main(String[] args) {
//        编译时异常
        try {
            new doSome();
        } catch (Except e) {
            e.printStackTrace();
        }
//        运行时异常
        try {
            new doOther();
        } catch (RunExcept e) {
            e.printStackTrace();
        }
        System.out.println("这是最后运行的语句");

        TestExcept te = new TestExcept("这是编译时异常");
        te.printStackTrace();
    }
}
