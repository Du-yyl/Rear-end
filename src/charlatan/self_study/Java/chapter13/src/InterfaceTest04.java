/**
 * time: 2022/5/5 21:50 31
 * ClassName: InterfaceTest04
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un h��ro?sme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class InterfaceTest04 {
    public static void main(String[] args) {
        Dong d = new Dong();
        ((Flyable) d).fly();

    }
}

interface Flyable {
    void fly();
}

class Dong {
}

// �̳к�ʵ�ֽӿ�ͬʱ����
class Cats extends Dong implements Flyable {

    @Override
    public void fly() {
        System.out.println("��è");
    }
}
