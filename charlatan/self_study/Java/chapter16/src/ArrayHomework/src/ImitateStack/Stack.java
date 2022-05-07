package ImitateStack;

/**
 * time :2022/5/7 16:10 12
 * ClassName :Stack
 * Package :ImitateStack
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */

/**
 * 模拟栈数据结构
 */
public class Stack {
    //    存储栈内存元素
    private final Object[] arr;
    //    栈帧
    private int index;

    /**
     * 接收到栈的大小，进行初始化
     *
     * @param len 初始化长度
     */
    public Stack(int len) {
        arr = new Object[len];
        index = 0;
    }

    /**
     * 出栈
     *
     * @return 将弹出元素进行返回
     */
    public Object pop() {
//        要返回的内容，使用变量进行存储
        Object obj;
        if (index < 0) {
//            如果已经小于 0 了，那么提示用户
            System.out.println("栈已空");
//            并将返回内容重置为 null
            obj = null;
        } else {
//            如果大于 0 ，那么数组中一定有元素
            obj = arr[index];
//            将已经返回的内容进行重置
            arr[index--] = null;
        }
        return obj;
    }

    /**
     * 将指定元素压栈
     *
     * @param obj 压栈元素
     */
    public void push(Object obj) {
//        如果下标小于 0 ，那么从 0 开始存储
        index = Math.max(index, 0);
        if (index >= arr.length) {
            System.out.println("栈内存溢出异常，元素下标 " + index-- + " 超出指定范围");
        } else {
            arr[index++] = obj;
            System.out.println("压栈成功");
        }
    }
}
