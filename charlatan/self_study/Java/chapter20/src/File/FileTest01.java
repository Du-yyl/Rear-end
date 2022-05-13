package File;

import java.io.File;
import java.io.IOException;

/**
 * time :2022/5/13 21:02 35
 * ClassName :FileTest01
 * Package :File
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class FileTest01 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\a\\a\\a\\a\\a");
//        判断这个文件或文件夹是否存在
        System.out.println(f1.exists());

        if (!f1.exists()) {
//            新建文件
//            f1.createNewFile();

//            如果不存在以目录形式创建【如果是多级目录，使用这个不会创建】
//            f1.mkdir();

//            如果不存在以多级目录创建
            f1.mkdirs();
        }

        File f2 = new File("D:\\Rear-end\\src\\charlatan\\self_study\\Java\\chapter20\\src\\File\\FileTest01.java");

//            获取指定的父文件路径
        System.out.println(f2.getParent());

//        获取父文件
        File f3 = f2.getParentFile();
//        获取绝对路径
        System.out.println(f3.getAbsolutePath());
//        获取绝对文件路径
        System.out.println(f3.getAbsoluteFile());
//        获取指定目录或文件的绝对路径，如果存在多个返回最先找到的那个
        System.out.println(new File("Users").getAbsolutePath());
    }
}
