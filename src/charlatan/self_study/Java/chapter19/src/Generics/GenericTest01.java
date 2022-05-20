package Generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * time :2022/5/11 22:22 06
 * ClassName :GenericTest01
 * Package :Generics
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class GenericTest01 {
    public static void main(String[] args) {
        /*
        1、JDK5.0之后推出的新特性：泛型
        2、泛型这种语法机制，只在程序编译阶段起作用，只是给编译器参考的。（运行阶段泛型没用！）
        3、使用了泛型好处是什么？
            第一：集合中存储的元素类型统一了。
            第二：从集合中取出的元素类型是泛型指定的类型，不需要进行大量的“向下转型”！

        4、泛型的缺点是什么？
            导致集合中存储的元素缺乏多样性！
            大多数业务中，集合中元素的类型还是统一的。所以这种泛型特性被大家所认可。
         */
//        使用泛型，表示指定的链表中只能存储指定的数据
        List<Animal> list = new ArrayList<Animal>();

        Animal a1 = new Cat();
        Animal a2 = new Dog();

        Cat a3 = new Cat();
        Dog a4 = new Dog();

        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);

//        指定迭代器迭代的类型
        Iterator<Animal> it = list.iterator();
        while (it.hasNext()) {
            Animal animal = it.next();
            if (animal instanceof Cat) {
                ((Cat) animal).cat();
            }
            if (animal instanceof Dog) {
                ((Dog) animal).dog();
            }
        }
    }
}

class Animal {
    public void move() {
        System.out.println("动物移动");
    }
}

class Cat extends Animal {
    public void cat() {
        System.out.println("猫抓老鼠");
    }
}

class Dog extends Animal {
    public void dog() {
        System.out.println("狗在抓猫");
    }
}
