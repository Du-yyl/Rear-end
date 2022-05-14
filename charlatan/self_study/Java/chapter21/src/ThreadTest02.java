/**
 * time :2022/5/14 21:48 22
 * ClassName :ThreadTest02
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ThreadTest02 {
    public static void main(String[] args) {
//        创建一个可运行的对象
        Test02 t = new Test02();
//        将可运行的对象封装为一个线程对象
        Thread thread = new Thread(t);
//        启动线程
        thread.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("main" + i);
        }
        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("次要线程" + i);
            }
        });
    }
}

class Test02 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("次要线程" + i);
        }
    }
}
