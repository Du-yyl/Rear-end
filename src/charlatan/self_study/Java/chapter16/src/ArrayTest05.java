import java.util.Arrays;

/**
 * time :2022/5/7 22:24 28
 * ClassName :ArrayTest05
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ArrayTest05 {
    public static void main(String[] args) {
        int[] arr = {34, 34, 34, 6, 567, 435, 23, 452, 345, 2345, 234, 52, 36, 347, 3, 5};
//        排序
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
//        查找
        int i = Arrays.binarySearch(arr, 2);
        System.out.println(i);

    }
}
