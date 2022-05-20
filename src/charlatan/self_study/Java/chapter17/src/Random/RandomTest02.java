package Random;

import java.util.Random;

/**
 * time :2022/5/9 18:05 41
 * ClassName :RandomTest02
 * Package :Random
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class RandomTest02 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[5];
        int index = 0;

        while (index < 5) {
            int rd = random.nextInt(6);
            if (!isExist(arr, rd)) {
                arr[index++] = rd;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static boolean isExist(int[] arr, int index) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == index) {
                return true;
            }
        }
        return false;
    }
}
