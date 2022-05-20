package ObjectStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * time :2022/5/14 19:19 26
 * ClassName :ObjectInputStreamTest01
 * Package :ObjectStream
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ObjectInputStreamTest01 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(".\\src\\charlatan\\self_study\\Java\\chapter20\\src\\ObjectStream\\OutputTest01"));
        Object obj = ois.readObject();
        System.out.println(obj);
        ois.close();
    }
}
