/**
 * time :2022/5/10 00:25 26
 * ClassName :MyException
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class MyException {
}

class Except extends Exception {
    String value;

    public Except(String value) {
        this.value = value;
    }

    public Except() {
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

class RunExcept extends RuntimeException {
    String value;

    public RunExcept(String value) {
        this.value = value;
    }

    public RunExcept() {
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

class doSome {
    Except e = new Except("编译时异常");

    public doSome() throws Except {
        System.out.println("编译时异常构造函数");
        throw e;
    }
}

class doOther {
    RunExcept re = new RunExcept("运行时异常");

    public doOther() throws RunExcept {
        System.out.println("运行时异常构造函数");

        throw re;
    }
}
