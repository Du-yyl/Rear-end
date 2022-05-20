/**
 * time :2022/5/19 16:58 24
 * ClassName :AnnotationTest02
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class AnnotationTest02 {
    public static void main(String[] args) {
        Test02 t = new Test02();
        t.doSome();

        Test02.doOther();
    }
}

@Deprecated(since = "10")
class Test02 {
    //    表示已过时，并且调用的方法中回出现横线
    @Deprecated
    public void doSome() {

    }

    @Deprecated
    public static void doOther() {

    }
}
