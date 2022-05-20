package HotelManagement;

/**
 * time :2022/5/7 18:46 25
 * ClassName :Hotel
 * Package :HotelManagement
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Hotel {
    Room[][] room = {
            {
                    new Room(false, 101, "标准"),
                    new Room(false, 102, "标准"),
                    new Room(false, 103, "标准"),
                    new Room(false, 104, "标准"),
                    new Room(false, 105, "标准"),
            }, {
            new Room(false, 201, "简陋"),
            new Room(false, 202, "简陋"),
            new Room(false, 203, "简陋"),
            new Room(false, 204, "简陋"),
            new Room(false, 205, "简陋"),
    }, {
            new Room(false, 301, "豪华"),
            new Room(false, 302, "豪华"),
            new Room(false, 303, "豪华"),
            new Room(false, 304, "豪华"),
            new Room(false, 305, "豪华"),
    }
    };

    /**
     * 订房方法
     *
     * @param roomNum 要订房的房间号
     */
    public void reservation(int roomNum) {
        for (int i = 0; i < room.length; i++) {
            for (int j = 0; j < room[i].length; j++) {
                if (roomNum == room[i][j].getNum()) {
                    if (!room[i][j].isState()) {
                        room[i][j].setState(true);
                        System.out.println("选择成功，欢迎入住");
                    } else {
                        System.out.println("抱歉，这个放假已经有人了，请重新选择");
                    }
                    return;
                }
            }
        }
        System.out.println("没有指定房间，请重新输入");
    }

    /**
     * 退房方法
     *
     * @param roomNum 要退的房间号
     */
    public void checkOut(int roomNum) {
        for (int i = 0; i < room.length; i++) {
            for (int j = 0; j < room[i].length; j++) {
                if (roomNum == room[i][j].getNum()) {
                    if (room[i][j].isState()) {
                        room[i][j].setState(false);
                        System.out.println("操作成功，" + room[i][j].getNum() + "号房已退");
                    } else {
                        System.out.println("这个房间已空，不需要退房");
                    }
                    return;
                }
            }
        }
        System.out.println("没有指定房间，请重新输入");
    }

    /**
     * 打印所有房间信息
     */
    public void printHome() {
        System.out.println("---------------------------------------------------------" +
                "--------------------------------------------------------------------" +
                "---------------------------------------------------------------");
        for (int i = 0; i < room.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < room[i].length; j++) {
                System.out.print(room[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------" +
                "------------------------------------------------------------------" +
                "-------------------------------------------------------------------");


    }

}
