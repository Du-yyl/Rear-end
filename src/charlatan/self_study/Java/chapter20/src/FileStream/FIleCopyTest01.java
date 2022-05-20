package FileStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * time :2022/5/13 16:33 11
 * ClassName :FileStream.FIleCopyTest01
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class FIleCopyTest01 {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;
        int convertLength = 1024 * 1024;
        try {
            byte[] bytes = new byte[convertLength];
            fis = new FileInputStream(".\\src\\charlatan\\self_study\\Java\\chapter20\\static\\Input\\Test01.jpg");
            fos = new FileOutputStream(".\\src\\charlatan\\self_study\\Java\\chapter20\\static\\Output\\OutputTest01.jpg");
            int contentsLength = 0;
            while ((contentsLength = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, contentsLength);
            }
        } catch (FileNotFoundException e) {
            System.out.println("读取路径错误");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("读取失败");
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                    System.out.println("流关闭成功");
                } catch (IOException e) {
                    System.out.println("流关闭失败");
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                    System.out.println("流关闭成功");
                } catch (IOException e) {
                    System.out.println("流关闭失败");
                    e.printStackTrace();
                }
            }
            long end = System.currentTimeMillis();
            System.out.println("一共耗时：" + ((end - begin) / 1000) + "秒");
        }

    }
}
