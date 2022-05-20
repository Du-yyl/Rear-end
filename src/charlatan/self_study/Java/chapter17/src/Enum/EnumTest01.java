package Enum;

/**
 * time :2022/5/9 19:42 03
 * ClassName :EnumTest01
 * Package :Enum
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class EnumTest01 {
    public static void main(String[] args) {
        /*
        枚举类型：
            枚举类型属于引用数据类型
            enum 枚举类型名:{
                属性值1，属性值2...
            }
            枚举类型编译也生成 class 文件
            当一个方法的返回值是两种情况时，可以使用布尔类型，
            如果一个方法返回结果是多种情况，并且还是一枚一枚可以枚举的，建议使用枚举类型
         */
        Season s = Season.Autumn;
        judgeSeason(s);
    }

    private static void judgeSeason(Season season) {
        switch (season) {
            case Spring:
                System.out.println("春天");
                break;
            case Summer:
                System.out.println("夏天");
                break;
            case Autumn:
                System.out.println("秋天");
                break;
            case Winter:
                System.out.println("冬天");
                break;
            default:
                System.out.println("输入错误");
        }
    }
}

/**
 * 四季
 */
enum Season {
    Spring, Summer, Autumn, Winter;
}
