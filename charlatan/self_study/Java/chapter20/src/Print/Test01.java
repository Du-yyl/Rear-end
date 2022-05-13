package Print;

import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;

/**
 * time :2022/5/13 20:35 21
 * ClassName :Test01
 * Package :Print
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Test01 {
    public static void main(String[] args) {
        try {
            Logger logger = new Logger("D:\\Rear-end\\src\\charlatan\\self_study\\Java\\chapter20\\static\\Output\\Test06.log", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS"));
            logger.log("ERROR", "这是错误事件");
            logger.log("ERROR", "这是错误事件");
            logger.log("ERROR", "这是错误事件");
            logger.log("INFO", "这是普通事件");
            logger.log("INFO", "这是普通事件");
            logger.log("INFO", "这是普通事件");
            logger.log("WARN", "这是警告事件");
            logger.log("WARN", "这是警告事件");
            logger.log("WARN", "这是警告事件");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("路径错误");
        }
    }
}
