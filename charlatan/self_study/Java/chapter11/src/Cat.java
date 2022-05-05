/**
 * time: 2022/5/4 17:52 47
 * ClassName: Cat
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Cat extends Animal {
    @Override
    public void move() {
        System.out.println("猫移动。。。");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
