/**
 * time: 2022/5/4 18:52 29
 * ClassName: Test03
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Test03 {
    public static void main(String[] args) {
        Animal a2 = new Dog();
        /*
            instanceof
                可以在运行阶段动态进行类型的判断，返回 true / false
            通过这个可以判断一个类型是否属于指定的类型，如果是的话，再进行对应的转型
         */
        if (a2 instanceof Cat) {
            // 这里如果直接进行强制转换，会在调用对应的方法时出错
            Cat c2 = (Cat) a2;
            c2.catchMouse();
        } else {
            System.out.println("不能转换");
        }
    }
}
