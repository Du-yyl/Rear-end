/**
 * time: 2022/4/25 22:15 46
 * ClassName: FloatTest01
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class FloatTest01 {
    public static void main(String[] args) {
        /*
        浮点型数据包含
            float   四个字节
            double  八个字节
        容量方面：
            浮点类型永远大于整数类型
            任意一个浮点都是整数大
        Java 中浮点数默认当作 double 类型处理
        如果要使用 float 要使用 F/f 进行强转
         */
//        存在强转
        float num1 = 1.23F;
//        不存在强转
        double num2 = 1.2345;


    }
}
