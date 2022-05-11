package ForEach;

/**
 * time :2022/5/11 22:59 21
 * ClassName :ForEachTest01
 * Package :ForEach
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ForEachTest01 {
    public static void main(String[] args) {
        /*
        JDK5.0 之后推出的新特性
         */
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("-----------------------------");
        /*
        for(元素类型 变量名 : 数组或集合){
        }
         */
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
