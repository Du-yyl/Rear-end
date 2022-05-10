/**
 * time: 2022/5/5 22:23 09
 * ClassName: Test02
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héro?sme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Test02 {
    public static void main(String[] args) {
//        通过多态完成不同对象的创建
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal bird = new Bird();
/*
        fixm e:在定义不同的动物的时候，直接使用 Animal 进行实例化，符合 OCP 原则，但是这并不能确定所有的动物都是会飞的，
         如果直接调用指定的动物可能不会飞，但是如果这个动物能飞，也是不能通过创建的 Animal 对象直接进行调用，也要进行强制转型，如下：
 */
        cat.move();
        dog.eat();
        bird.eat();
//        以上为基本用法
        System.out.println("----------------------");
        if (cat instanceof Flyable) {
            ((Cat) cat).fly();
            ((Cat) cat).subFly();
            ((Cat) cat).supFly();
        } else {
            System.out.println("这个动物不能飞");
        }
        System.out.println("----------------------");
        if (dog instanceof Flyable) {
            ((Flyable) dog).fly();
            ((Flyable) dog).subFly();
            ((Flyable) dog).supFly();
        } else {
            System.out.println("这个动物不能飞");
        }
        System.out.println("----------------------");
        if (bird instanceof Flyable) {
            ((Flyable) bird).fly();
            ((Flyable) bird).subFly();
            ((Flyable) bird).supFly();
        } else {
            System.out.println("这个动物不能飞");
        }
    }
}
