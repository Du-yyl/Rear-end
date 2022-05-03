/**
 * time: 2022/5/3 19:12 52
 * ClassName: ThisTest02
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ThisTest02 {
    public static void main(String[] args) {
        Date d1 = new Date();
        Date d2 = new Date(2001, 12, 2);
        d1.detail();
        d2.detail();
    }
}

class Date {
    private int year;
    private int mouth;
    private int day;

    public Date() {
        /*
        这个方法调用的时候，使用的是相似的代码，只不过定义的内容不同，所以可以使用更加简洁的方法
        使用 this（）

         */
//        this.year = 1970;
//        this.mouth = 1;
//        this.day = 1;

//        这一行的作用和上面三行的方式一样，只不过这种方式直接调用了有参构造，通过不同的数值调用进行不同内容的初始化，代码更加简化
//        实际上是通过一个构造方法调用另一个构造方法
//        this（）这种方式只能在构造方法中只能出现一行，只能出现一行

        this(1970,1,1);
    }

    public Date(int year, int mouth, int day) {
        this.year = year;
        this.mouth = mouth;
        this.day = day;
    }

    public void detail() {
        System.out.println(year + "年" + mouth + "月" + day + "日");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMouth() {
        return mouth;
    }

    public void setMouth(int mouth) {
        this.mouth = mouth;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
