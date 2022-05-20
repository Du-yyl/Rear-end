package ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * time :2022/5/14 19:21 58
 * ClassName :ObjectOutputStreamTest02
 * Package :ObjectStream
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ObjectOutputStreamTest02 {
    public static void main(String[] args) throws IOException {
//        序列化多个对象
        User u1 = new User("张三", 12);
        User u2 = new User("李四", 16);
        User u3 = new User("王五", 15);
        User u4 = new User("赵六", 14);
        User u5 = new User("正一", 13);
        User u6 = new User("张三", 11);
        List<User> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        list.add(u5);
        list.add(u6);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(".\\src\\charlatan\\self_study\\Java\\chapter20\\src\\ObjectStream\\OutputTest02"));
        oos.writeObject(list);
        oos.flush();
        oos.close();
    }
}
