/**
 * time: 2022/5/5 22:07 56
 * ClassName: Dog
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héro?sme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃东西的方法");
    }

    @Override
    public void move() {
        System.out.println("狗移动的方法");
    }
}
