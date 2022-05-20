package DataFile;

import java.io.*;

/**
 * time :2022/5/13 18:34 36
 * ClassName :DataOutputStreamTest01
 * Package :DataFile
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class DataOutputStreamTest01 {
    public static void main(String[] args) throws IOException {
/*
        DataInputStream:数据字节输入流。
        DataOutputStream写的文件，只能使用DataInputStream去读。并且读的时候你需要提前知道写入的顺序。
        读的顺序需要和写的顺序一致。才可以正常取出数据。
 */
        int i = 10;
        byte b = 20;
        short s = 30;
        long l = 40l;
        float f = 50f;
        double d = 60;
        boolean boo = true;
        char c = 40;
        OutputStream os = new FileOutputStream("D:\\Rear-end\\src\\charlatan\\self_study\\Java\\chapter20\\static\\Output\\Test04");
        DataOutputStream dos = new DataOutputStream(os);
        dos.flush();
//        可以将类型一并切入文件中
        dos.writeInt(i);
        dos.writeByte(b);
        dos.writeShort(s);
        dos.writeLong(l);
        dos.writeFloat(f);
        dos.writeBoolean(boo);
        dos.writeDouble(d);
        dos.writeChar(c);
        dos.close();
    }
}
