package IOProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * time :2022/5/14 20:31 07
 * ClassName :IOProperties
 * Package :IOProperties
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class IOProperties {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(".\\src\\charlatan\\self_study\\Java\\chapter20\\src\\IOProperties\\info");
        byte[] bytes = new byte[4];
        int len;
        StringBuffer sb = new StringBuffer();
        while ((len = fis.read(bytes)) != -1) {
            sb.append(new String(bytes, 0, len));
        }
        Properties per = new Properties();
        String str = String.valueOf(sb);
        String[] strings = str.split("\n");
        for (String string : strings) {
            String[] strs = string.split("=");
            per.put(strs[0], strs[1]);
        }
        Set<Map.Entry<Object, Object>> set = per.entrySet();
        for (Map.Entry<Object, Object> objectObjectEntry : set) {
            System.out.println(objectObjectEntry.getKey() + ", " + objectObjectEntry.getValue());
        }
        fis.close();
    }
}
