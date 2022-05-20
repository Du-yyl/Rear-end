/**
 * time: 2022/4/27 17:39 30
 * ClassName: Ninety_nineMultiplicationTable
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Ninety_nineMultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + " * " + i + " = " + (i * j) + "\t");
            System.out.println();
        }
    }
}
