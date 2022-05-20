package Thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

/**
 * time :2022/5/16 18:23 21
 * ClassName :TimerTask
 * Package :Thread
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class TimerTaskTest {
    public static void main(String[] args) throws ParseException {
        Timer timer = new Timer();
//        这里创建对象的可以是 true 表示使用守护线程的方式创建
//        Timer timer = new Timer(true);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
//        根据指定的字符串生成一个日期，方便调用
        Date firstTime = sdf.parse("2012-5-16 18:37:00 000");
        timer.schedule(new timerTask(), firstTime, 1000 * 2);

    }
}

/**
 * 定义一个要运行的方法，继承 TimerTask ，并实现其中的 run 方法
 */
class timerTask extends java.util.TimerTask {

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String time = sdf.format(new Date());
        System.out.println("进行数据的备份，时间：" + time);
    }
}
