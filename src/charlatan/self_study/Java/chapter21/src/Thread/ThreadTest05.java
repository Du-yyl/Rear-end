package Thread;

/**
 * time :2022/5/15 17:19 40
 * ClassName :ThreaTest05
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ThreadTest05 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Test05());
//        如果要让睡眠的线程中途唤醒，可以使用 Thread 中的方法
        thread.start();
        try {
            Thread.sleep(2000);
//          睡眠中断【中断的原理是让对应的 sleep 线程抛出异常，然后进入 try...catch 结束睡眠
            thread.interrupt();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

class Test05 implements Runnable {
    @Override
    public void run() {
        System.out.println("开始执行");
        /*
        在 run 中的方法，不能抛出异常因为重写的 run 没有抛出任何异常
        重写后的方法不能抛出更多的异常，可以更少
         */
        try {
            Thread.sleep(60 * 60 * 24);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "---->");
    }
}
