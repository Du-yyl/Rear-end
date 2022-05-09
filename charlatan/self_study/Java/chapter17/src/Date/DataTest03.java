package Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * time :2022/5/9 17:12 11
 * ClassName :DataTest03
 * Package :Date
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class DataTest03 {
    public static void main(String[] args) {
//        获取时间戳
        long date = System.currentTimeMillis();
//        将时间戳格式化为能识别的时间
        Date d1 = new Date(date);
//        设置时间格式
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss SSS");
//        将时间转换为符合只当格式的时间
        String date1 = sdf.format(d1);

        System.out.println(date1);
    }
}
