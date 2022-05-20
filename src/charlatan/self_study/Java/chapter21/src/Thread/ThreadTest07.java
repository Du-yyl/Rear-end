package Thread;

/**
 * time :2022/5/15 18:05 32
 * ClassName :Thread.ThreadTest07
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ThreadTest07 {
    public static void main(String[] args) {
        System.out.println("最高优先级" + Thread.MAX_PRIORITY);
        System.out.println("最低优先级" + Thread.MIN_PRIORITY);
        System.out.println("默认优先级" + Thread.NORM_PRIORITY);
        // 获取当前线程对象，获取当前线程的优先级
        Thread currentThread = Thread.currentThread();
        // main线程的默认优先级是：5
        System.out.println(currentThread.getName() + "线程的默认优先级是：" + currentThread.getPriority());

        Thread thread = new Thread(new Test07());
        thread.start();

    }
}

class Test07 implements Runnable {

    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName() + "线程的默认优先级是：" + currentThread.getPriority());

    }
}
