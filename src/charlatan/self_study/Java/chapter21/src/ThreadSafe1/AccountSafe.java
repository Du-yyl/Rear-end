package ThreadSafe1;

/**
 * time :2022/5/15 19:19 50
 * ClassName :Account
 * Package :ThreadSafe
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class AccountSafe {
    private String ID;
    private int balance;

    public AccountSafe(String ID, int balance) {
        this.ID = ID;
        this.balance = balance;
    }

    public String getID() {
        return ID;
    }

    private void setID(String ID) {
        this.ID = ID;
    }

    public int getBalance() {
        return balance;
    }

    private void setBalance(int balance) {
        this.balance = balance;
    }

    public void withdrawMoney(int money) {
        /*
        synchronized
            使用这个关键字，将要同步指定的代码块放在这里
        这个关键字后（）中的内容需要是多个线程共享的数据，如果需要 t1 t2 t3 t4 进行限制 而 t5 t6
        不需要进行限制，则需要放t1 t2 t3 t4共享的数据，那么他们就能实现线程的安全

        在java语言中，任何一个对象都有“一把锁”，其实这把锁就是标记。（只是把它叫做锁。）
        100个对象，100把锁。1个对象1把锁。

        以下代码的执行原理？
            1、假设t1和t2线程并发，开始执行以下代码的时候，肯定有一个先一个后。
            2、假设t1先执行了，遇到了synchronized，这个时候自动找“后面共享对象”的对象锁，
            找到之后，并占有这把锁，然后执行同步代码块中的程序，在程序执行过程中一直都是
            占有这把锁的。直到同步代码块代码结束，这把锁才会释放。
            3、假设t1已经占有这把锁，此时t2也遇到synchronized关键字，也会去占有后面
            共享对象的这把锁，结果这把锁被t1占有，t2只能在同步代码块外面等待t1的结束，
            直到t1把同步代码块执行结束了，t1会归还这把锁，此时t2终于等到这把锁，然后
            t2占有这把锁之后，进入同步代码块执行程序。

            这样就达到了线程排队执行。
            这里需要注意的是：这个共享对象一定要选好了。这个共享对象一定是你需要排队
            执行的这些线程对象所共享的。
         */
        //synchronized ("abc") { // "abc"在字符串常量池当中。
        //synchronized (null) { // 报错：空指针。
        synchronized (this) {
            int before = getBalance();
            if (before >= money) {
                int after = before - money;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                setBalance(after);
                System.out.println("取款成功，取款：" + money + "元");
            } else {
                System.out.println("取款失败，余额：" + getBalance() + "元");
            }
        }
        System.out.println("这是代码块之外的内容");
    }
}
