package FileStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * time :2022/5/12 23:37 08
 * ClassName :FileStream.FileInputStreamTest03
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(".\\src\\charlatan\\self_study\\Java\\chapter20\\static\\FileInputStreamTest");
            byte[] bytes = new byte[5];
            int len;
            while ((len = fis.read(bytes)) != -1) {
//                通过字符串中的方法，有多少内容就转换多少内容
                System.out.print(new String(bytes, 0, len));
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
