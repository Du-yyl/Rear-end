/**
 * time: 2022/5/5 22:08 45
 * ClassName: Bird
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un h��ro?sme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Bird extends Animal implements Flyable {
    @Override
    public void eat() {
        System.out.println("����Զ���");
    }

    @Override
    public void move() {
        System.out.println("������ɵ�");
    }

    @Override
    public void fly() {
        System.out.println("���ǻ�ɵ�");
    }

    @Override
    public void supFly() {
        System.out.println("���ܷɵĺܿ�");
    }

    @Override
    public void subFly() {
        System.out.println("�һ���������");
    }
}
