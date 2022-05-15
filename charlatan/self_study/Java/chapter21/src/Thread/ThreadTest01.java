package Thread;

/**
 * time :2022/5/14 21:34 45
 * ClassName :Thread.ThreadTest01
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ThreadTest01 {
    public static void main(String[] args) {
//        创建一个线程对象
        Test01 t = new Test01();
//        这种方式只是一种普通的调用
//        Thread.Test01.run();
//        这种方式是开启一个多线程，并且自动调用 run 方法，和主线程中调用的main方法的调用一样
        t.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("main方法中的线程" + i);
        }
    }
}

class Test01 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("次要线程——>" + i);
        }
    }
}
