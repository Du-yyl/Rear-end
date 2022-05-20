import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * time :2022/5/19 17:06 20
 * ClassName :AnnotationTest03
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class AnnotationTest03 {
    public static void main(String[] args) {

    }

    //    这种方式的注解必须在直接后跟随指定的字段
//    @Test03(name = "")
//    如果属性名时value的话，可以省略属性名，直接书写属性值
    @Test03("test")
    public void doSome(String name) {

    }
}

// 这个注解只能使用在 类 和 方法 上
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD})
// 希望注解只在 java 文件中保存【只在编译阶段有效】
@Retention(RetentionPolicy.SOURCE)
@interface Test03 {
    /**
     * 这种方式是在注解中定义属性，这个name是一个属性
     * 如果使用有默认值，可以不用调用时赋值
     * 如果属性名时value的话，可以省略属性名，直接书写属性值
     * 如果要指定的参数时一个数组，并且数组中只有一个元素，数组的大括号可以省略
     *
     * @return
     */
    String name() default "这里可以直接指定默认值";

    String value();
}

@interface Test04 {
    byte value1();

    short value2();

    int value3();

    long value4();

    float value5();

    double value6();

    boolean value7();

    char value8();

    interface value9 {
    }

    ;

    class value10 {
    }

    ;

    int[] value11();
}
