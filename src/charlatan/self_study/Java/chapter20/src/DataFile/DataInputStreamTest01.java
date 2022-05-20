package DataFile;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * time :2022/5/13 18:44 51
 * ClassName :DataInputStreamTest01
 * Package :DataFile
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class DataInputStreamTest01 {
    public static void main(String[] args) throws Exception {
        DataInputStream dis = new DataInputStream(new FileInputStream("D:\\Rear-end\\src\\charlatan\\self_study\\Java\\chapter20\\static\\Output\\Test04"));

//        读的时候必须按照写入的顺序读，否则数据无效
        System.out.println(dis.readInt());
        System.out.println(dis.readByte());
        System.out.println(dis.readShort());
        System.out.println(dis.readLong());
        System.out.println(dis.readFloat());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readDouble());
        System.out.println(dis.readChar());

        dis.close();

    }
}
