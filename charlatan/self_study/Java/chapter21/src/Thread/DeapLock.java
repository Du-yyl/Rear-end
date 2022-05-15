package Thread;

/**
 * time :2022/5/15 20:58 19
 * ClassName :DeapLock
 * Package :Thread
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class DeapLock {
    public static void main(String[] args) {
//        创建两个对象，交给两个线程中进行保管
        Object o1 = new Object();
        Object o2 = new Object();

//        创建对象
        Thread t1 = new Thread(new Thead01(o1, o2));
        Thread t2 = new Thread(new Thead02(o1, o2));

//        开启线程
        t1.start();
        t2.start();

    }
}

class Thead01 implements Runnable {
    final Object o1;
    final Object o2;

    public Thead01(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
//        让第一个线程保存第一个锁
        synchronized (o1) {
//            让这个线程睡眠，并且保证，让这个线程无法执行完，保证 o1 锁无法释放
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//            这里需要拿到 o2 的锁，才能正确运行
            synchronized (o2) {
                System.out.println("第一个线程");
            }
        }
    }
}

class Thead02 implements Runnable {
    final Object o1;
    final Object o2;

    public Thead02(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
//        第二个线程保存 o2 的锁
        synchronized (o2) {
//            这里睡一秒，保证这个线程无法立马执行，一直拿着 o2 的锁
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//            这里需要拿到 o1 的锁才能结束【但是 o2 的锁因为被 o1 占用，所以 o2 无法释放，第二个线程中的内容无法结束】
            synchronized (o1) {
                System.out.println("第一个线程");
            }
        }
    }
}
