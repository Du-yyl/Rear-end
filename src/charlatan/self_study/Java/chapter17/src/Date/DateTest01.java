package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * time :2022/5/9 16:42 25
 * ClassName :DateTest01
 * Package :Date
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class DateTest01 {
    public static void main(String[] args) throws Exception {
//        创建一个时间对象
        Date d = new Date();
        System.out.println(d);
//        日期的格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS");
//        通过时间的类型通过 format 方法进行时间的格式化，返回一个字符串
        String str1 = sdf.format(d);
        String str2 = sdf1.format(d);
        System.out.println(str1);
        System.out.println(str2);
//        字符串转为 data 类型【这里定义的格式，必须和要进行转换的日期格式相同】,如果格式不一样，直接报异常
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS");
        Date d1 = sdf2.parse(str2);
        System.out.println(d1);


    }
}
