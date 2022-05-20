/**
 * time :2022/5/6 21:29 01
 * ClassName :FinalizeTest01
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class FinalizeTest01 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            Test06 t = new Test06();
            t = null;
//            建议 GC 启动，但是 GC 可能不接收建议
            System.gc();
        }

    }
}

class Test06 {
    //    当一个对象的内存地址销毁的时候，会调用这个方法
    protected void finalize() throws Throwable {
        // this代表当前对象
        System.out.println(this + "即将被销毁！");
    }
}
