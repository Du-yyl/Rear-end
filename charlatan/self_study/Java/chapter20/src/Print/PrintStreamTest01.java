package Print;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * time :2022/5/13 18:53 13
 * ClassName :PrintStreamTest01
 * Package :Print
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class PrintStreamTest01 {
    public static void main(String[] args) throws IOException {
        PrintStream ps = System.out;
//        标准输出流打印到控制台，不需要关闭
        ps.println(123);
//        这个方法可以改变默认的输出方向
//        更改后，直接会向指定的文件中打印
        System.setOut(new PrintStream(new FileOutputStream("D:\\Rear-end\\src\\charlatan\\self_study\\Java\\chapter20\\static\\Output\\Test05.log", true)));
        ps.println("测试内容");
        System.out.println("测试");
        System.out.println("ERROR 2020-1-1 内容请求错误");
        System.out.println("NRM 2020-1-1 内容请求错误");
        System.out.println("ERR 2020-1-1 内容请求错误");
        System.out.println("ResourceSys 2020-1-1 内容请求错误");
        System.out.println("[Login]:  2020-1-1 内容请求错误");
        System.out.println("[TSDK]:  2020-1-1 内容请求错误");
        System.out.println("[I] 03/18 12:18:19.847 [TSDK]: ====>PlayerLoginRequest,uin:148831035  version:2.0.0.442");
        System.out.println("[I] 03/18 12:18:19.847 [TSDK]: ====>PlayerLoginRequest,uin:148831035  version:2.0.0.442");
    }
}
