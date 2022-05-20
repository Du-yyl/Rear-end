package BufferedStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * time :2022/5/13 18:24 14
 * ClassName :BufferWriterTest01
 * Package :BufferedStream
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class BufferWriterTest01 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Rear-end\\src\\charlatan\\self_study\\Java\\chapter20\\static\\Output\\Test03.txt"));
        bw.write("测试内容");
        bw.write("\n");
        bw.write("测试内容");
        bw.flush();
        bw.close();
    }
}
