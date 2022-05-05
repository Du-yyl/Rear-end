/**
 * time: 2022/5/4 17:53 48
 * ClassName: Test01
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Test01 {
    public static void main(String[] args) {
//        夫类型引用指向子类型对象
        /*
        编译阶段：
            对于编译器来说，编译器只知道新建的类型是一个指定的类型，所以会到指定的类文件中找对应的方法，并且找到了
            所以编译成功，这个阶段是静态绑定
        运行阶段：
            运行阶段的时候，是在堆内存中创建了一个区域，并且这个区域属于子类型对象，访问的对应方法访问的是子类型中的方法
            这个阶段属于运行绑定（动态绑定）
        因为编译阶段和运行阶段有两种完全不同的形态，得名：多态。
         */
        Animal a1 = new Cat();
        a1.move();
        Animal a2 = new Dog();
        a2.move();
    }
}
