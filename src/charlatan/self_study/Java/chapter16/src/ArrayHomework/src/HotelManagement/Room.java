package HotelManagement;

/**
 * time :2022/5/7 18:46 49
 * ClassName :Room
 * Package :HotelManagement
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Room {
    //    房间状态，true 表示有人，反之表示空房
    private boolean state;
    //    房间编号
    private int num;
    //    房间类型
    private String type;

    public Room(boolean state, int num, String type) {
        this.state = state;
        this.num = num;
        this.type = type;
    }

    @Override
    public String toString() {
        return "房间状态：" + (state ? "有人" : "空房") +
                "，房间号：" + num +
                "，房间类型：" + type;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public int getNum() {
        return num;
    }

    public boolean isState() {
        return state;
    }

}
