package Thread;

/**
 * time :2022/5/15 16:41 09
 * ClassName :Thread.ThreadTest03
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ThreadTest03 {
    public static void main(String[] args) {
        Test03 t = new Test03();
        Thread thread = new Thread(t);
//        修改指定线程名
        thread.setName("分支线程");
//        获取线程名字
        /*
        如果不对线程进行名字的修改，会自动命名为
            Thread-0
            Thread-1
            Thread-2
        主线程命名为：main
         */
        System.out.println(thread.getName());
//        启动线程
        thread.start();
//        获取当前线程名字
        Thread thread1 = Thread.currentThread();
        System.out.println(thread1.getName());
    }
}

class Test03 implements Runnable {

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        for (int i = 0; i < 100; i++) {
            System.out.println(thread.getName() + "----->" + i);
        }
    }
}
