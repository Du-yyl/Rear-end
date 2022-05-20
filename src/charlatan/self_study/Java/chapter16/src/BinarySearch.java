/**
 * time :2022/5/7 21:50 19
 * ClassName :BinarySearch
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = binarySearch(arr, 10);
//        System.out.println(index == -1 ? "没有这个元素":"这个元素的下表是："+index);
        System.out.println(index == -1 ? "没有这个元素" : "这个元素的下表是：" + index);

        System.out.println(9 / 2);
    }

    private static int binarySearch(int[] arr, int i) {
        int len = arr.length;
        int index = len / 2;
        int max = len;
        for (int j = 0; j < len / 2; j++) {
            if (arr[index] == i) {
                return index;
            } else {
                if (arr[index] > i) {
                    max = index;
                    index /= 2;
                    System.out.println(index);
                } else {
                    index = (index + max) / 2;
                }
            }
        }
        return -1;
    }

    public static int binarySearch1(int[] arr, int dest) {
        // 开始下标
        int begin = 0;
        // 结束下标
        int end = arr.length - 1;
        // 开始元素的下标只要在结束元素下标的左边，就有机会继续循环。
        while (begin <= end) {
            // 中间元素下标
            int mid = (begin + end) / 2;
            if (arr[mid] == dest) {
                return mid;
            } else if (arr[mid] < dest) {
                // 目标在“中间”的右边
                // 开始元素下标需要发生变化（开始元素的下标需要重新赋值）
                begin = mid + 1; // 一直增
            } else {
                // arr[mid] > dest
                // 目标在“中间”的左边
                // 修改结束元素的下标
                end = mid - 1; // 一直减
            }
        }
        return -1;
    }
}
