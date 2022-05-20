import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * time :2022/5/9 22:47 43
 * ClassName :ExceptionTest03
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ExceptionTest03 {
    public static void main(String[] args) {
        /*
        catch 后的小括号中的类型可以是具体的异常类型，也可以是这个异常的父类型
        catch 可以写多个，根据不同的类型会走不同的 catch 语句
        catch 的时候，建议一个一个精确地进行处理
        catch 写多个地时候，必须遵循从上到下，从小到大的顺序写
        java8 之后可以在一个 catch 中写多个异常，使用 | 进行连接，表示或的关系
         */
        doSome();

    }

    private static void doSome() {
        try {
            new FileReader("");
            System.out.println(100 / 0);
        } catch (FileNotFoundException | ArithmeticException e) {

            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
