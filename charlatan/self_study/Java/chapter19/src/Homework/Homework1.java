package Homework;

import java.util.*;

/**
 * time :2022/5/12 21:29 35
 * ClassName :Homework1
 * Package :Homework
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Homework1 {
    public static void main(String[] args) {
        /*
        已知数组存放一批QQ号码，QQ号码最长为11位，最短为5位String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"}。
        将该数组里面的所有qq号都存放在LinkedList中，将list中重复元素删除，将list中所有元素分别用迭代器和增强for循环打印出来。
         */
        String[] strs = {"12345", "67891", "12347809933", "98765432102", "67891", "12347809933"};
        List<String> list = new ArrayList<>(Arrays.asList(strs));
        Iterator<String> it = list.iterator();
        int index = 0;
        while (it.hasNext()) {
//            根据下标，如果和循环的次数是不同的，那么就认为这个元素已经重复了，删除就行
            if (index++ != list.indexOf(it.next())) {
                it.remove();
            }
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
