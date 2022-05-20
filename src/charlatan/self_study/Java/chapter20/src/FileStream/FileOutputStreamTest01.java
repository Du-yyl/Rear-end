package FileStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * time :2022/5/13 00:01 53
 * ClassName :FileStream.FileOutputStreamTest01
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        /*
        这种方式会将文件清空再进行写入
         */
        FileOutputStream fos = null;
        try {
//            在使用构造方法中可以跟一个布尔值，表示是否在文件后追加，如果是 true 会追加，反之会覆盖，默认为 false
            fos = new FileOutputStream(".\\src\\charlatan\\self_study\\Java\\chapter20\\static\\输出测试文件.txt", true);
            byte[] bytes = {97, 98, 99, 100};
//            写入数组中全部内容
            fos.write(bytes);
            fos.write(32);
//            写入指定的部分内容

            fos.write(bytes, 0, 2);
        } catch (FileNotFoundException e) {
            System.out.println("路径错误");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IO数据异常");
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    System.out.println("流关闭成功");
                    fos.close();
                } catch (IOException e) {
                    System.out.println("流关闭失败");
                    e.printStackTrace();
                }
            }
        }
    }
}
