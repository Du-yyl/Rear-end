package ThreadSafe;

/**
 * time :2022/5/15 19:19 50
 * ClassName :Account
 * Package :ThreadSafe
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Account {
    private String ID;
    private int balance;

    public Account(String ID, int balance) {
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

        int before = getBalance();
        if (before >= money) {
            int after = before - money;
            /*
            当在这里进行数据的更改，两个线程都能获取到数据，但是更新的时候会进行延迟，就有一定出现问题
             */
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
}
