/**
 * time: 2022/4/26 18:52 10
 * ClassName: BinaryCommonMethod
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * @apiNote :比较常用的二进制方法汇总
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class BinaryCommonMethod {
    /**
     * 计算指定内容的上一个值和下一个值
     * 计算 n + 1 或 n - 1
     * -~n == n + 1，~n为其取反，负号 ’ - ’ 再对其取反并加 1。
     * ~-n == n - 1，思路就是找到最低位的第一个1，对其取反并把该位后的所有位也取反，即01001000变为01000111。
     *
     * @param num 要进行计算的数字
     * @return 返回一个数组，其中包含了传入的数组的上一个值和下一个值
     */
    public static int[] CalculateNeighbors(int num) {
        return new int[]{-~num, ~-num};
    }

    /**
     * 将一个数字取反并返回 —— 取反并加1，也即~n + 1或者(n ^ -1) + 1。
     *
     * @param num 要取反的数字
     * @return 返回的数字
     */
    public static int DigitalInversion(int num) {
        return ~num + 1;
    }

    /**
     * 二进制判断奇偶
     *
     * @param num 要判断的数组
     * @return 返回判断结果，如果是偶数返回 true 反之 返回 false
     */
    public static boolean JudgeParity(int num) {
        return (num & 1) == 1;
    }

    /**
     * 返回两个数中较大的数【数字 31 是针对 int 大小为 32 而言】
     *
     * @param num1 第一个数字
     * @param num2 第二个数字
     * @return 返回最大的数
     */
    public static int Max(int num1, int num2) {
        return (num2 & ((num1 - num2) >> 31)) | (num1 & (~(num1 - num2) >> 31));
    }

    /**
     * 计算一个数字是否是 2 的幂
     *
     * @param num 要计算的数字
     * @return 返回结果
     */
    public static boolean is_power_of_two(int num) {
        return num > 0 && (num & (num - 1)) == 0;
    }
}
