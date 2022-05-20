/**
 * time: 2022/5/5 22:08 45
 * ClassName: Bird
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héro?sme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Bird extends Animal implements Flyable {
    @Override
    public void eat() {
        System.out.println("鸟儿吃东西");
    }

    @Override
    public void move() {
        System.out.println("鸟儿靠飞的");
    }

    @Override
    public void fly() {
        System.out.println("我是会飞的");
    }

    @Override
    public void supFly() {
        System.out.println("我能飞的很快");
    }

    @Override
    public void subFly() {
        System.out.println("我还能慢慢飞");
    }
}
