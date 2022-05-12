import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * time :2022/5/12 23:44 32
 * ClassName :FileInputStreamTest04
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class FileInputStreamTest04 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(".\\src\\charlatan\\self_study\\Java\\chapter20\\static\\FileInputStreamTest");
            fis.read();
//            这个方法可以返回还剩下多少个可以读取
            System.out.println(fis.available());
//            这个方法可以跳过多少个不读取
            fis.skip(1);
            System.out.println((char) fis.read());
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
