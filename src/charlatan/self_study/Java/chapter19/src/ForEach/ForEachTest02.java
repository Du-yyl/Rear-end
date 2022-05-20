package ForEach;

import java.util.ArrayList;
import java.util.List;

/**
 * time :2022/5/11 23:10 16
 * ClassName :ForEachTest03
 * Package :ForEach
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ForEachTest02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        for (int i :
                list) {
            System.out.println(i);
        }

    }
}
