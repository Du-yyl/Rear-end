package Thread;

import java.text.SimpleDateFormat;

/**
 * time :2022/5/16 18:10 29
 * ClassName :ThreadTest09
 * Package :Thread
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ThreadTest09 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Test09());
//        设置成守护线程【会在 main 中启动的时候，自动进行启动，并且在 main 结束的时候，自动结束】
        thread.setDaemon(true);
        thread.start();
    }
}

class Test09 implements Runnable {
    @Override
    public void run() {
        while (true) {
            long time = System.currentTimeMillis();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss SSS");
            String date = sdf.format(time);
            System.out.println("时间：" + date);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
