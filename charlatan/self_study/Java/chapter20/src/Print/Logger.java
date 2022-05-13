package Print;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * time :2022/5/13 20:13 36
 * ClassName :Logger
 * Package :Print
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Logger {
    //    要输出日志的路径
    private String url;

    public String getUrl() {
        return url;
    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    //    创建日志对象时进行时间格式的初始化
    private SimpleDateFormat sdf;

    /**
     * 构造函数
     *
     * @param url 要输出日志的路径
     * @param sdf 输出日志时的格式化方式
     */
    public Logger(String url, SimpleDateFormat sdf) throws FileNotFoundException {
        this.url = url;
        this.sdf = sdf;
        System.setOut(new PrintStream(new FileOutputStream(url, true)));
    }

    /**
     * 打印日志信息
     *
     * @param logLevel 日志事件的等级
     * @param msg      日志事件
     */
    public void log(String logLevel, String msg) {
        String time = sdf.format(new Date());
        System.out.println(logLevel + " " + time + " —— " + msg);
    }
}
