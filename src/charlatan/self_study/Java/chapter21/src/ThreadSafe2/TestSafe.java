package ThreadSafe2;

/**
 * time :2022/5/15 19:28 50
 * ClassName :Test
 * Package :ThreadSafe
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class TestSafe {
    public static void main(String[] args) {
        AccountSafe acc = new AccountSafe("123", 10000);
//        两个账户共享一个对象
        ThreadAccount ta1 = new ThreadAccount(acc);
        ThreadAccount ta2 = new ThreadAccount(acc);

        Thread t1 = new Thread(ta1);
        Thread t2 = new Thread(ta2);

        t1.start();
        t2.start();
    }
}
