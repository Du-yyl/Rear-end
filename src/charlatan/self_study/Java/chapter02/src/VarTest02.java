/**
 * time: 2022/4/25 17:58 52
 * ClassName: VarTest02
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class VarTest02 {
    public static void main(String[] args) {
//        这种方式进行声明，只有 num3 是进行赋值的，num1 和 num2 是没有赋值的，使用时直接报错
        int num1, num2, num3 = 10;
        System.out.println(num3);
//        这种方式声明是进行赋值声明的
        int nums1 = 100, nums2 = 200, nums3 = 300;
        System.out.println(nums1);
        System.out.println(nums2);
        System.out.println(nums3);
    }
}
