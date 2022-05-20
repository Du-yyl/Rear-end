package Integer;

/**
 * time :2022/5/9 15:41 28
 * ClassName :IntegerTest05
 * Package :Integer
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class IntegerTest05 {
    public static void main(String[] args) {
/*
        static  int parseInt(String s)
                将字符串转换为数字。
*/
        int i = Integer.parseInt("123");
        System.out.println(i);

/*
        static int compare(int x, int y)
            比较数字大小，
            如果右边大，返回 -1
            如果左边大，返回 1
            如果相等，返回 0
 */
        System.out.println(Integer.compare(12, 23));

/*
        static int max(int a, int b)
            返回两个 int的较大值，就像调用 Math.max一样 。
 */
        System.out.println(Integer.max(12, 13));
/*

        static int sum(int a, int b)
            根据+运算符将两个整数相加。
 */
        System.out.println(Integer.sum(12, 12));

/*
        static String toBinaryString(int i)
            返回指定数字的二进制形式。
        static String toHexString(int i)
            返回指定的内容的 16 进制。
        static String toOctalString(int i)
            返回指定内容的8进制。
 */
        System.out.println(Integer.toBinaryString(3));
        System.out.println(Integer.toHexString(12));
        System.out.println(Integer.toOctalString(9));
/*
        static Integer valueOf(int i)
            返回一个 Integer 类型的数据
 */
        Integer i1 = Integer.valueOf(123);
        Integer i2 = Integer.valueOf("123");
        Integer i3 = Integer.valueOf("123", 2);

    }
}
