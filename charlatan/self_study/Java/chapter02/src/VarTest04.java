/**
 * time: 2022/4/25 18:20 34
 * ClassName: VarTest04
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class VarTest04 {
    //    成员变量
    int num = 20;

    public static void main(String[] args) {
//        局部变量
        int num = 30;
//        虽然这两处的名称相同，但是属于不同的区域和变量，保存的内容不同，访问时根据就近元素，先访问自身方法中的内容，如果没有访问外部变量
        System.out.println(num);
    }
}
