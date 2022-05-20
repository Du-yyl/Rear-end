package ImitateStack;

/**
 * time :2022/5/7 18:06 36
 * ClassName :Test01
 * Package :ImitateStack
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Test01 {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(new Test());
        s.push(new Test());
        s.push(new Test());
        s.push(new Test());
        s.push(new Test());
        s.push(new Test());
        System.out.println("------------------");
        for (int i = 0; i < 6; i++) {
            Object obj = s.pop();
            if (obj instanceof Test) {
                Test t1 = (Test) obj;
                t1.say();
            } else {
                System.out.println("类型错误");
            }
        }


    }
}

class Test {
    public void say() {
        System.out.println("你好，世界！！！");
    }
}
