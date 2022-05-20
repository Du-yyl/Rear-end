package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * time :2022/5/13 22:20 00
 * ClassName :Test01
 * Package :File
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Test01 {
    static int StrLen;

    public static void main(String[] args) {
        File file1 = new File("D:\\EDGE下载文件");
        File file2 = new File("D:\\拷贝测试（可删除）");
        if (file2.exists()) {
            StrLen = file1.toString().length();
            arCopy(file1, file2);
        } else {
            file2.mkdirs();
            arCopy(file1, file2);
        }
    }

    private static void arCopy(File file1, File file2) {
        if (file1.isFile()) {
//            System.out.println(file2);
            FileInputStream fis = null;
            FileOutputStream fos = null;
            String name = file1.getName();
            try {
                fis = new FileInputStream(file1);
                fos = new FileOutputStream(file2 + file1.toString().substring(StrLen));
                byte[] bytes = new byte[1024 * 1024];
                int len;
                while ((len = fis.read(bytes)) != -1) {
                    fos.write(bytes, 0, len);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (fis != null) {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fos != null) {
                    try {
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
        File[] files = file1.listFiles();
//        要截取的原本路径的长度
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
//                    获取到要创建的文件夹名称
                    String subStr = file2 + file.getAbsolutePath().substring(StrLen);
                    File subFIle = new File(subStr);
                    if (file.exists()) {
                        subFIle.mkdirs();
                    }
                }
                arCopy(file, file2);
            }
        }
    }
}
