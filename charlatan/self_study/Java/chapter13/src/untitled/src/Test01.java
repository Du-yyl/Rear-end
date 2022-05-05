/**
 * time: 2022/5/5 22:09 56
 * ClassName: Test01
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héro?sme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Test01 {
    public static void main(String[] args) {
//        通过多态完成不同对象的创建
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal bird = new Bird();
    }
}
