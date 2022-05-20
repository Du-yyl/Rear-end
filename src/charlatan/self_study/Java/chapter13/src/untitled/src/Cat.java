/**
 * time: 2022/5/5 22:06 25
 * ClassName: Cat
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héro?sme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Cat extends Animal implements Flyable {
    @Override
    public void eat() {
        System.out.println("猫吃东西");
    }

    @Override
    public void move() {
        System.out.println("猫移动了");
    }

    @Override
    public void fly() {
        System.out.println("这是一只能飞的猫");
    }

    @Override
    public void supFly() {
        System.out.println("我能飞的很快");
    }

    @Override
    public void subFly() {
        System.out.println("我能慢点飞");
    }
}
