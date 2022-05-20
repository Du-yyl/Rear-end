package File;

import java.io.File;

/**
 * time :2022/5/13 21:30 34
 * ClassName :FileTest03
 * Package :File
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class FileTest03 {
    public static void main(String[] args) {
        File file = new File("D:\\a");
//        获取文件下的子文件
        for (File listFile : file.listFiles()) {
            System.out.println(listFile);
        }
    }
}
