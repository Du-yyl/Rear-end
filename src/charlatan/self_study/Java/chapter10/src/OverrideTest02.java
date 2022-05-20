/**
 * time: 2022/5/4 17:29 26
 * ClassName: OverrideTest02
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class OverrideTest02 {
    public static void main(String[] args) {
        Data d1 = new Data();
        System.out.println(d1);
        Data d2 = new Data(2000, 10, 1900);
        System.out.println(d2);
    }
}

class Data {
    private int year;
    private int month;
    private int day;

    public Data() {
        this(1970, 1, 1);
    }

    public Data(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString() {
        return year + "年" + month + "月" + day + "日";
    }
}
