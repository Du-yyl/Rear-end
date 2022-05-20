/**
 * time :2022/5/9 22:12 33
 * ClassName :ExceptionTest02
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ExceptionTest02 {
    public static void main(String[] args) {
        try {
            doSome();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 这个使用了 throws ，表示这个方法执行的时候，可能抛出 ClassNotFoundException 异常
     * 这个异常的父类是 Exception ，所以这个异常属于编译时异常
     * 因为这里进行了 throws ，所以调用者必须对异常内容进行处理
     *
     * @throws ClassNotFoundException 可能抛出的异常
     */
    private static void doSome() throws ClassNotFoundException {
        System.out.println("doSome");
    }

}
