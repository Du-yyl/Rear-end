package ObjectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * time :2022/5/14 19:26 35
 * ClassName :ObjectInputStreamTest02
 * Package :ObjectStream
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ObjectInputStreamTest02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        反序列化多个对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(".\\src\\charlatan\\self_study\\Java\\chapter20\\src\\ObjectStream\\OutputTest02"));
        Object obj = ois.readObject();
        if (obj instanceof ArrayList) {
            ((ArrayList<?>) obj).forEach(System.out::println);
        }
        System.out.println();
        ois.close();
    }
}
