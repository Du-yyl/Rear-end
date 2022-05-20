package Integer;

/**
 * time :2022/5/9 15:20 05
 * ClassName :IntegerTest04
 * Package :Integer
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class IntegerTest04 {
    public static void main(String[] args) {
//        自动装箱
        Integer i1 = 123;
        Integer i2 = 214;
//      自动拆箱
        int i3 = i1;
        int i4 = i2;
/*
        因为 【-128 —— 127】 中的数组经常使用，所以，当初始化 Integer 时，就会将
        【-128 —— 127】 中的所哟内容直接创建成了 Integer 对象，使用的时候直接引用，
        所以输入是否相等，直接对比内存地址，返回相等，但是如果超出范围，则需要在堆内存中创建内容，
        这个内容的内存地址是不相同的
 */
        Integer i5 = 127;
        Integer i6 = 127;

        Integer i8 = 128;
        Integer i9 = 128;

        System.out.println(i5 == i6);
        System.out.println(i8 == i9);
    }
}
