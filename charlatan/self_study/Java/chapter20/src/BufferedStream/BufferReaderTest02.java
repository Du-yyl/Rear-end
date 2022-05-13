package BufferedStream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * time :2022/5/13 18:18 01
 * ClassName :BufferReaderTest02
 * Package :BufferedStream
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class BufferReaderTest02 {
    public static void main(String[] args) throws Exception {
//        字节流
        FileInputStream fis = new FileInputStream("D:\\Rear-end\\src\\charlatan\\self_study\\Java\\chapter20\\static\\Input\\Egg.txt");
//        转换流（将字节流转换为字符流）
        InputStreamReader isr = new InputStreamReader(fis);
//        在构造方法中传入一个字符流
        BufferedReader br = new BufferedReader(isr);

        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        br.close();
    }
}
