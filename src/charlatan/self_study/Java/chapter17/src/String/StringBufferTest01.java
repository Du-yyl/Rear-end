package String;

/**
 * time :2022/5/9 13:57 02
 * ClassName :StringBufferTest01
 * Package :String
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class StringBufferTest01 {
    public static void main(String[] args) {
        /*
        如果需要大量的字符串拼接，使用原始的字符串拼接方式，会在方法区内存中创造大量的不必要的空间的浪费
        给方法区内存带来更多压力
         */
        String str = "";
        for (int i = 0; i < 100; i++) {
            str = str + i;
        }
        /*
        StringBuffer 底层实际创建了一个 byte 数组，这个数组大小默认是 16，这个也称为’字符串缓冲区对象‘，
        每调用一次 append 方法，底层实际完成了 byte 数组的拷贝，通过不断的拷贝完成内容的扩容
        如果底层的 byte 数组满了，会自动扩容
        为什么 StringBuffer 的数组内容可变，而字符串中的内容不可变
            虽然二者在底层都是使用的 byte 的数组进行了字符串的存储，但是 String 新建的对象的 byte 数组是通过
            final 进行修饰的，而 StringBuffer 没有
        如何优化 StringBuffer 性能？
            初始化的时候，尽量选定一个较大的内存
         */
        StringBuffer sb = new StringBuffer();
        sb.append(123);
        sb.append("测试");
        sb.append("内容");
        sb.append("内容");
        sb.append("内容");
        sb.append("内容");
        sb.append("内容");
        sb.append("内容");
        sb.append("内容");
        sb.append("内容");
        sb.append("内容");
        sb.append("内容");
        sb.append("内容");
        System.out.println(sb);

    }
}
