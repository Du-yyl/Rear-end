package Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * time :2022/5/11 22:40 56
 * ClassName :GenericTest02
 * Package :Generics
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class GenericTest02 {
    public static void main(String[] args) {
        /*
        JDK8之后引入了：自动类型推断机制。（又称为钻石表达式）
         */
//        这里的 ArrayList 类型会自动推断，不过只有在JDK8之后
        List<Animal> list = new ArrayList<>();
    }
}
