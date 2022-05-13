package FileStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * time :2022/5/13 17:06 47
 * ClassName :FileReader
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class FileReaderTest01 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader(".\\src\\charlatan\\self_study\\Java\\chapter20\\static\\输出测试文件.txt");
            char[] chars = new char[3];
            int len = 0;
            if (fr.ready()) {
                while ((len = fr.read(chars)) != -1) {
                    System.out.print(new String(chars, 0, len));
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("文件路径错误");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("读取失败");
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                    System.out.println("流关闭成功");
                } catch (IOException e) {
                    System.out.println("流关闭失败");
                    e.printStackTrace();
                }
            }
        }
    }
}
