/**
 * time: 2022/5/5 16:07 32
 * ClassName: FinalTest01
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class FinalTest01 {
    public static void main(String[] args) {
        /*
        final
            表示最终的，不可变的，final 可以修饰变量、方法、类
            final 修饰的变量
                不能被修改，如果是引用数据，只要内存地址不变，就认为不变
            final 修饰的方法
                不能被覆盖，被重写
            final 修饰的类
                不能被继承
            final 修饰的引用
                这个引用只能指向这个对象，并且只能指向该对象，无法再指向其他对象。
                并且这个方法执行的过程中，这个引用指向对象后，不会被垃圾回收器回收，知道方法结束，内存才会释放
            final 修饰的实例变量
                系统不能赋默认值，要求在调用时必须手动进行赋值
         */
        final int i = 10;

        final A a = new A("张三");
        a.name = "李四";
        System.out.println(a.name);
    }
}

// final 修饰的类，不能被继承
final class A {
    //    String name;
//    如果成员变量加上 final 关键字，那么这个变量也会变成不能被修改的
    String name;

    public A(String name) {
        this.name = name;
    }
}

class B {
    //    被 final 修饰的方法不能被覆盖
    public final void doSome() {
    }

    public void doOther() {
    }
}

class C extends B {
//    public final void doSome(){}

    public final void doOther() {
    }
}

