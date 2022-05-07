/**
 * time :2022/5/7 20:50 17
 * ClassName :SelectionSort
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class SelectionSort {
    public static void main(String[] args) {
//        每一次都找到最好的那个数字，然后将这个数字放到数组的最前方
        int temp;
        int[] arr = {0, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int i = 0; i < arr.length - 1; i++) {
            int small = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[small] > arr[j]) {
                    small = j;
                }
            }
            if (small != i) {
                temp = arr[i];
                arr[i] = arr[small];
                arr[small] = temp;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
