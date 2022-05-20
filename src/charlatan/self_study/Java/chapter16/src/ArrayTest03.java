/**
 * time :2022/5/7 00:40 33
 * ClassName :ArrayTest03
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ArrayTest03 {
    public static void main(String[] args) {
        /*
        一维数组的扩容
            如果数组中的满了，需要再创造一个新的数组，将这个小容量的数组重新拷贝到这个大容量的数组中
         */
        int[] arr1 = {1, 2, 3, 4, 5, 5};
        int[] arr2 = new int[10];
/*
        通过 SUN 提供的方法来完成数组的拷贝
        参数：
            - 要拷贝的数组
            - 要拷贝内容的起始位置
            - 要将数组拷贝到哪个位置
            - 要将老数组拷贝到哪个数组
            - 将老数组拷贝到新数组的哪个位置
            - 要拷贝数组的长度
 */
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);

        System.out.println(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
