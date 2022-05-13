package FileStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * time :2022/5/12 22:50 28
 * ClassName :FileStream.FileInputStreamTest01
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class FileInputStreamTest01 {
    public static void main(String[] args) {
        /*
        java.io.FileInputStream:
            1、文件字节输入流，万能的，任何类型的文件都可以采用这个流来读。
            2、字节的方式，完成输入的操作，完成读的操作（硬盘---> 内存）
        一次读取一个字节，和硬盘频繁的交互，大部分性能都耗费在硬盘和内存的交互上了
         */
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:\\Rear-end\\src\\charlatan\\self_study\\Java\\chapter20\\static\\FileInputStreamTest");
            int bytes = 0;
//            循环读取数据
            while ((bytes = fis.read()) != -1) {
                System.out.print((char) bytes);
            }
        } catch (FileNotFoundException e) {
            System.out.println("路径错误");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IO数据异常");
            e.printStackTrace();
        } finally {
//            如果定义的文件的读取对象是空的话是没必要关闭的
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
