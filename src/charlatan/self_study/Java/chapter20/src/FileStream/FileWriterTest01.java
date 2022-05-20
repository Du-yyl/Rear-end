package FileStream;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * time :2022/5/13 17:21 08
 * ClassName :FileStream.FileWriterTest01
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class FileWriterTest01 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(".\\src\\charlatan\\self_study\\Java\\chapter20\\static\\Output\\Test02", true);
            int len = 0;
            fw.write("测试内容");

            fw.flush();

        } catch (FileNotFoundException e) {
            System.out.println("文件路径错误");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("读取失败");
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                    System.out.println("流关闭成功");
                } catch (IOException e) {
                    System.out.println("流关闭失败");
                    e.printStackTrace();
                }
            }
        }
    }
}
