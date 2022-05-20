package Thread;

/**
 * time :2022/5/15 17:13 36
 * ClassName :Thread.ThreadTest04
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ThreadTest04 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Test04());
        thread.setName("分支线程");

        thread.start();
        try {
/*
            让线程休眠对应的时间，参数是毫秒，谁调用谁休眠
            这个方法是静态方法，如果使用实例调用，依然是使用的类名的方法
            是不能通过实例方式调用来终止实例的进程的
*/
            Thread.sleep(1000 * 4);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("这是main中的方法");

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("这个方法也能实现一段代码的间隔执行");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Test04 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
