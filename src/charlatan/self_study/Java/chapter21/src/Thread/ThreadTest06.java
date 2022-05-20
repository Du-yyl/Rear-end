package Thread;

/**
 * time :2022/5/15 17:43 43
 * ClassName :Thread.ThreadTest06
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ThreadTest06 {
    public static void main(String[] args) {
        Test06 test = new Test06();
        Thread thread = new Thread(test);
        thread.setName("分支线程");
        thread.start();
        try {
            Thread.sleep(1000 * 5);
            test.run = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Test06 implements Runnable {
    boolean run = true;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (run) {
                System.out.println(Thread.currentThread().getName() + "--->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println(Thread.currentThread().getName() + "数据保存成功");
                return;
            }
        }
    }
}
