package ThreadSafe2;

/**
 * time :2022/5/15 19:27 39
 * ClassName :ThreadAccount
 * Package :ThreadSafe
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ThreadAccount implements Runnable {
    private AccountSafe acc;

    public ThreadAccount(AccountSafe acc) {
        this.acc = acc;
    }

    @Override
    public void run() {
        acc.withdrawMoney(10000);

    }
}
