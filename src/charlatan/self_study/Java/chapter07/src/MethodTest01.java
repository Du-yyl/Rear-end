/**
 * time: 2022/4/30 18:58 18
 * ClassName: MethodTest01
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class MethodTest01 {
    public static void main(String[] args) {
//        通过类名点的方式调用
        User.doSome();
        User user = new User();
//        通过实例的方式调用
        user.doOther();
    }
}

class User {
    //    静态方法，通过‘类名.’的方式进行调用
    public static void doSome() {
        System.out.println("doSome");
    }

    //    实例方法，通过‘引用.’的方式调用
    public void doOther() {
        System.out.println("doOther");
    }
}
