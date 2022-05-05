/**
 * time: 2022/5/4 17:05 57
 * ClassName: OverrideTest01
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class OverrideTest01 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.move();
        Cat c = new Cat();
        c.move();
    }
}

class Animal {
    public void move() {
        System.out.println("动物移动，，，，，");
    }
}

class Dog {
    @Override
    public void move() {
        System.out.println("狗移动。。。");
    }
}

class Cat {
    public void move() {
        System.out.println("猫移动。。。");
    }
}