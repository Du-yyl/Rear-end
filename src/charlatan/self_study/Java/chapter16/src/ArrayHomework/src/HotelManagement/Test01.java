package HotelManagement;

import java.util.Scanner;

/**
 * time :2022/5/7 19:02 17
 * ClassName :Test01
 * Package :HotelManagement
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Test01 {
    public static void main(String[] args) {
        Hotel h = new Hotel();
        h.printHome();
        h.reservation(202);
        h.reservation(202);
        h.printHome();
        h.reservation(203);
        h.printHome();
        h.reservation(204);
        h.printHome();
        h.reservation(207);
        h.printHome();
        h.checkOut(204);
        h.printHome();

        h.checkOut(203);
        h.printHome();

        h.checkOut(202);
        h.checkOut(202);
        h.checkOut(202);
        Scanner s = new Scanner(System.in);
        h.printHome();
    }
}
