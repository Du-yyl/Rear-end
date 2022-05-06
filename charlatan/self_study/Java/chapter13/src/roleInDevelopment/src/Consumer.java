/**
 * time :2022/5/6 16:18 29
 * ClassName :Consomer
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Consumer {
    private Mean FoodMean;

    public Mean getFoodMean() {
        return FoodMean;
    }

    public void setFoodMean(Mean foodMean) {
        FoodMean = foodMean;
    }

    public Consumer() {
        FoodMean = new Chef1();
    }

    public Consumer(Mean foodMean) {
        FoodMean = foodMean;
    }

    public void orderDishes() {
        FoodMean.huangMenJi();
    }
}
