/**
 * time: 2022/5/5 21:35 05
 * ClassName: InterfaceTest03
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un h��ro?sme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class InterfaceTest03 {
    public static void main(String[] args) {
        Inter1 i1 = new Inter();

//        �ӿںͽӿ�֮�����ǿ������ת����ʱ��û�м̳й�ϵ��Ҳ�����ǿת
//        û�м̳е�ǿת������׶�û�����⣬�������н׶λᱨ�� ���� ClassCaseException
        Inter2 i22 = (Inter2) i1;

    }
}

interface Inter1 {
    void m1();
}

interface Inter2 {
    void m2();
}

class Inter implements Inter1 {
    @Override
    public void m1() {
        System.out.println("m1");
    }
}
