/**
 * time: 2022/5/5 21:09 30
 * ClassName: InterfaceTest02
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héro?sme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class InterfaceTest02 {
    public static void main(String[] args) {
        /*
        类和类之间叫做继承，类和接口之间叫做实现
        实现使用 implements 完成
         */

//        接口和多态结合
        Animal cat = new Cat();
        Animal dog = new Dog();
        Speck dog1 = new Dog();
        cat.move();
        cat.eat();
        dog.move();
        dog.eat();
        dog1.say();
    }
}

interface Animal {
    void eat();

    void move();
}

interface Speck {
    void say();
}

// 类实现接口使用的关键字是 implements
class Cat implements Animal, Speck {
    @Override
    public void eat() {
        System.out.println("猫在吃鱼");
    }

    @Override
    public void move() {
        System.out.println("猫在移动");
    }

    @Override
    public void say() {
        System.out.println("猫的叫声");
    }
}

// 同时实现多个接口，接口实现多继承
class Dog implements Animal, Speck {
    @Override
    public void eat() {
        System.out.println("狗在吃东西");
    }

    @Override
    public void move() {
        System.out.println("狗在移动");
    }

    @Override
    public void say() {
        System.out.println("狗的叫声");
    }
}
