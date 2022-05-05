/**
 * time: 2022/5/5 17:46 47
 * ClassName: AbstractTest01
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class AbstractTest01 {
    public static void main(String[] args) {
/*
    抽象类
        类和类之间具有共同特征，将这些共同特征提取出来，形成的就是抽象类。
        抽象类也属于引用数据类型
        [修饰符列表] abstract class 类名{
            类体;
        }
        抽象类是无法实例化的，无法创建对象的，所以抽象类是用来被子类继承的。
        final 和 abstract 不能联合使用，这两个关键字是对立的。
        抽象类的子类可以是抽象类。也可以是非抽象类。
        抽象类虽然无法实例化，但是抽象类有构造方法，这个构造方法是供子类使用的。
        抽象方法特点是：
            抽象方法表示没有实现的方法，没有方法体的方法。
            特点1：没有方法体，以分号结尾。
            特点2：前面修饰符列表中有abstract关键字。
        抽象类中不一定有抽象方法，抽象方法必须出现在抽象类中。
        抽象类中的抽象方法如果被子类继承，那么子类必须要对抽象的方法进行实现
 */
    }
}

abstract class Account {
    String name;

    //    定义抽象方法，继承的子类必须实现
    public abstract void doSome();
}

abstract class CredAccount extends Account {


}

class Cred extends CredAccount {
    @Override
    public void doSome() {
        System.out.println("doSome");
    }
}