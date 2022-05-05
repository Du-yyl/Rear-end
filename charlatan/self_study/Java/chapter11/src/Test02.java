/**
 * time: 2022/5/4 18:08 14
 * ClassName: Test02
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Test02 {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        /*
        编译阶段报错
            因为编译阶段，编译器知道 a1 是 Animal 类型，所以去 Animal 中找对应的 catchMouse 方法，但是并没有找到，因为这是 Cat 独有的，
            所以报错
         */
//        a1.catchMouse();

        /*
        什么时候用向下转型？
            如果要访问的方法是子类中独有的，那么必须使用向下转型（不转型，编译都过不去）
         */
        Cat c1 = (Cat) a1;
        c1.catchMouse();

//        创建一个 Dog 类
        Animal a2 = new Dog();
//        通过向下转型，将这个动物类转换为 Cat 类型（但实际是 Dog 类型）
        Cat c2 = (Cat) a2;
//        调用 Cat 中的独有方法，但是因为这个对象的本质是 Dog 所以，运行时报错
        c2.catchMouse();
    }
}
