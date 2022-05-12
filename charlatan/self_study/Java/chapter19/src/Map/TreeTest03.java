package Map;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * time :2022/5/12 20:43 52
 * ClassName :TreeSetTest03
 * Package :Map
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class TreeTest03 {
    public static void main(String[] args) {
        Car c1 = new Car(5);
        Car c2 = new Car(4);
        Car c3 = new Car(3);
        Car c4 = new Car(2);
        Car c5 = new Car(1);
//        TreeSet<Car> car1 = new TreeSet<>((o1, o2) -> o1.id - o2.id);
//        TreeSet<Car> car2 = new TreeSet<>(Comparator.comparingInt(o -> o.id));
        TreeSet<Car> car = new TreeSet<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.id - o2.id;
            }
        });
        car.add(c1);
        car.add(c2);
        car.add(c3);
        car.add(c4);
        car.add(c5);
        for (Car car1 : car) {
            System.out.println(car1);
        }
    }

}

class Car {
    int id;

    public Car(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                '}';
    }
}

class compare implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.id - o2.id;
    }
}
