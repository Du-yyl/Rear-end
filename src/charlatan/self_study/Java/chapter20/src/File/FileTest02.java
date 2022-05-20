package File;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * time :2022/5/13 21:20 53
 * ClassName :FileTest02
 * Package :File
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class FileTest02 {
    public static void main(String[] args) {
        File f1 = new File("D:\\a\\a\\a\\a\\a\\a.txt");
//        获取文件名
        System.out.println(f1.getName());
//        判断是否是一个文件
        System.out.println(f1.isFile());
//        判断是否是一个目录
        System.out.println(f1.isDirectory());
//        获取文件最后修改事件，返回的是一个时间戳
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS ").format(new Date(f1.lastModified())));
//        获取文件大小【返回的结果是字节数】
        System.out.println(f1.length());
    }
}
