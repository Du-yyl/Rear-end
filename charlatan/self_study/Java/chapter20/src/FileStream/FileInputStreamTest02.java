package FileStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * time :2022/5/12 23:12 16
 * ClassName :FileStream.FileInputStreamTest02
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class FileInputStreamTest02 {
    public static void main(String[] args) {
        /*
        int read(byte[] b)
        一次最多读取 b.length 的字节
         */
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(".\\src\\charlatan\\self_study\\Java\\chapter20\\static\\FileInputStreamTest");
//            byte[] bytes = new byte[50];
//            int len = fis.read(bytes);
//            for (int i = 0; i < len; i++) {
//                System.out.print((char) bytes[i]);
//            }
            /*
            这里的数组如果读不到直接返回的内容是 -1
             */
            byte[] bytes = new byte[5];
            int len;
            while ((len = fis.read(bytes)) != -1) {
                for (int i = 0; i < len; i++) {
                    System.out.print((char) bytes[i]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("路径错误");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IO数据异常");
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    System.out.println("流关闭成功");
                    fis.close();
                } catch (IOException e) {
                    System.out.println("流关闭失败");
                    e.printStackTrace();
                }
            }
        }
    }
}
