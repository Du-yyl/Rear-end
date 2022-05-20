package BufferedStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * time :2022/5/13 17:50 34
 * ClassName :BufferReaderTest01
 * Package :BufferedStream
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class BufferReaderTest01 {
    public static void main(String[] args) {
/*
        BufferedReader:
            带有缓冲区的字符输入流。
            使用这个流的时候不需要自定义char数组，或者说不需要自定义byte数组。自带缓冲。
 */
        FileReader fr = null;
        BufferedReader br = null;
        try {
            // 当一个流的构造方法中需要一个流的时候，这个被传进来的流叫做：节点流。
            // 外部负责包装的这个流，叫做：包装流，还有一个名字叫做：处理流。
            // 像当前这个程序来说：FileReader就是一个节点流。BufferedReader就是包装流/处理流。
            fr = new FileReader("D:\\Rear-end\\src\\charlatan\\self_study\\Java\\chapter20\\static\\Input\\Egg.txt");
            br = new BufferedReader(fr);
//            这个方法直接读一行，如果读到内容返回的是 null
            String str = null;
            while ((str = br.readLine()) != null) {
//                这个方法虽然读一行，是不会读换行符的
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    /*
                        当包装流和节点流都存的时候，只需要关闭包装流就行了，根据源代码更细，包装流关闭的时候，节点流也会关闭
                     */
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
