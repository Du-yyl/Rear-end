/**
 * time: 2022/5/5 22:06 25
 * ClassName: Cat
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un h��ro?sme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Cat extends Animal implements Flyable {
    @Override
    public void eat() {
        System.out.println("è�Զ���");
    }

    @Override
    public void move() {
        System.out.println("è�ƶ���");
    }

    @Override
    public void fly() {
        System.out.println("����һֻ�ܷɵ�è");
    }

    @Override
    public void supFly() {
        System.out.println("���ܷɵĺܿ�");
    }

    @Override
    public void subFly() {
        System.out.println("���������");
    }
}
