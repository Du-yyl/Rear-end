package IOProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * time :2022/5/14 20:47 05
 * ClassName :IOPropertiesTest01
 * Package :IOProperties
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class IOPropertiesTest01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(".\\src\\charlatan\\self_study\\Java\\chapter20\\src\\IOProperties\\info");
        Properties pro = new Properties();
//        直接使用 pro 的 load 方法就能完成指定内容的获取在
        pro.load(fis);
        System.out.println(pro.get("name"));
        System.out.println(pro.get("password"));
        fis.close();
    }
}
