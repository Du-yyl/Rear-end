package Thread;

/**
 * time :2022/5/15 19:00 43
 * ClassName :Thread.ThreadTest08
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ThreadTest08 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Test08());
        System.out.println("main begin");
        thread.start();
//        线程合并
        try {
            /*
            原理是先运行指定线程中的内容，知道对应线程运行完，才会运行主线程中的内容
            内存上连个栈依然没有改变，只是发生了等待关系
             */
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main over");
    }
}

class Test08 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
