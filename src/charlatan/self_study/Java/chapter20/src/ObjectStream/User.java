package ObjectStream;

import java.io.Serializable;

/**
 * time :2022/5/14 18:56 56
 * ClassName :User
 * Package :ObjectStream
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class User implements Serializable {
    private String name;
    //    transient 表示游离的，不参与序列化的
    private transient int id;

    /*
    如果生成了一个序列化对象，代码更改后就不能再进行反序列化的操作
    建议手动写一个序列化版本号，这样在文件的修改后也能进行对应的反序列化操作
     */

    //    private static final long serialVersionUID = 1L;
    public User(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("测试");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
