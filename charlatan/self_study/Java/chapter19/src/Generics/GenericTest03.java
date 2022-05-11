package Generics;

/**
 * time :2022/5/11 22:46 05
 * ClassName :GenericTest03
 * Package :Generics
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class GenericTest03<E> {
    public void doSome(E e) {
        System.out.println(e);
    }

    public static void main(String[] args) {
        GenericTest03<String> gt = new GenericTest03<>();
        gt.doSome("测试内容");

        GenericTest03<Integer> gt1 = new GenericTest03<>();
        gt1.doSome(123);
    }
}
