/**
 * time: 2022/5/5 12:38 38
 * ClassName: Test01
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Test01 {
    public static void main(String[] args) {
        Pet dog = new Dog();
        Pet cat = new Cat();
        Pet yingWu = new YingWu();
        Master master = new Master();

        master.feed(yingWu);
        master.feed(cat);
        master.feed(dog);
    }
}
