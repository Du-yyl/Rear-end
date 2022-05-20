package Break;

/**
 * time :2022/5/10 19:47 48
 * ClassName :BreakLabel
 * Package :Break
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class BreakLabel {
    public static void main(String[] args) {
        // todoEnd: 2022/5/10 19:47 —— break label 的使用
        /*
        指定一个变量区域，当满足一个条件后，直接会跳出这个代码块中的内容

         */
        int i = 0;
        label:
        {
            for (; i < 10; i++) {
                if (i == 5) {
                    break label;
                }
            }
        }
        System.out.println(i);
    }
}
