package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask; // JUC包下的，属于java的并发包，老JDK中没有这个包。新特性。

/**
 * time :2022/5/16 18:40 15
 * ClassName :ThreadTest10
 * Package :Thread
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ThreadTest10 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
        实现线程的第三种方式：
            实现Callable接口
            这种方式的优点：可以获取到线程的执行结果。
            这种方式的缺点：效率比较低，在获取t线程执行结果的时候，当前线程受阻塞，效率较低。
         */
//        创建一个未来任务类对象【这个里面的参数是一个 Callable 接口的实现类对象】
        FutureTask ft = new FutureTask(new Callable() {
            /**
             * 这个 call 方法就相当于 run 方法
             * @return 这个方法是可以有返回值的
             * @throws Exception 可以抛出错误
             */
            @Override
            public Object call() throws Exception {
                System.out.println("begin");
                Thread.sleep(1000);
                System.out.println("end");
                return new Object();
            }
        });
//        创建线程对象
        Thread t = new Thread(ft);
        t.start();
//        获取指定的内容的返回值，因为这个方法要执行完才能得到返回值，会造成 main 线程的阻
        Object obj = ft.get();
        System.out.println(obj);

    }
}
