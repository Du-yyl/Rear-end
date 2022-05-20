package FileStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * time :2022/5/13 17:26 15
 * ClassName :FileStream.FileCopyTest02
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class FileCopyTest02 {
    public static void main(String[] args) {
//        文本文件的拷贝
        FileWriter fw = null;
        FileReader fr = null;

        try {
            fr = new FileReader(".\\src\\charlatan\\self_study\\Java\\chapter20\\static\\Input\\Egg.txt");
            fw = new FileWriter(".\\src\\charlatan\\self_study\\Java\\chapter20\\static\\Output\\Egg.txt");
            char[] chars = new char[10];
            int len = 0;
            while ((len = fr.read(chars)) != -1) {
                fw.write(chars, 0, len);
            }

            fw.flush();
        } catch (FileNotFoundException e) {
            System.out.println("文件路径读取失败");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("输出文件路径出错");
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                    System.out.println("输入流关闭成功");
                } catch (IOException e) {
                    System.out.println("输入流关闭失败");
                    e.printStackTrace();
                }
            }
            if (fw != null) {
                try {
                    fw.close();
                    System.out.println("输出流关闭成功。");
                } catch (IOException e) {
                    System.out.println("输出流关闭失败");
                    e.printStackTrace();
                }
            }
        }

    }
}
