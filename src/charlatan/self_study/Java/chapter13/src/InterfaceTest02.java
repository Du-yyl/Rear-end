/**
 * time: 2022/5/5 21:09 30
 * ClassName: InterfaceTest02
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un h��ro?sme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class InterfaceTest02 {
    public static void main(String[] args) {
        /*
        �����֮������̳У���ͽӿ�֮�����ʵ��
        ʵ��ʹ�� implements ���
         */

//        �ӿںͶ�̬���
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

// ��ʵ�ֽӿ�ʹ�õĹؼ����� implements
class Cat implements Animal, Speck {
    @Override
    public void eat() {
        System.out.println("è�ڳ���");
    }

    @Override
    public void move() {
        System.out.println("è���ƶ�");
    }

    @Override
    public void say() {
        System.out.println("è�Ľ���");
    }
}

// ͬʱʵ�ֶ���ӿڣ��ӿ�ʵ�ֶ�̳�
class Dog implements Animal, Speck {
    @Override
    public void eat() {
        System.out.println("���ڳԶ���");
    }

    @Override
    public void move() {
        System.out.println("�����ƶ�");
    }

    @Override
    public void say() {
        System.out.println("���Ľ���");
    }
}
