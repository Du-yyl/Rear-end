/**
 * time: 2022/5/5 22:23 09
 * ClassName: Test02
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un h��ro?sme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Test02 {
    public static void main(String[] args) {
//        ͨ����̬��ɲ�ͬ����Ĵ���
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal bird = new Bird();
/*
        fixm e:�ڶ��岻ͬ�Ķ����ʱ��ֱ��ʹ�� Animal ����ʵ���������� OCP ԭ�򣬵����Ⲣ����ȷ�����еĶ��ﶼ�ǻ�ɵģ�
         ���ֱ�ӵ���ָ���Ķ�����ܲ���ɣ����������������ܷɣ�Ҳ�ǲ���ͨ�������� Animal ����ֱ�ӽ��е��ã�ҲҪ����ǿ��ת�ͣ����£�
 */
        cat.move();
        dog.eat();
        bird.eat();
//        ����Ϊ�����÷�
        System.out.println("----------------------");
        if (cat instanceof Flyable) {
            ((Cat) cat).fly();
            ((Cat) cat).subFly();
            ((Cat) cat).supFly();
        } else {
            System.out.println("������ﲻ�ܷ�");
        }
        System.out.println("----------------------");
        if (dog instanceof Flyable) {
            ((Flyable) dog).fly();
            ((Flyable) dog).subFly();
            ((Flyable) dog).supFly();
        } else {
            System.out.println("������ﲻ�ܷ�");
        }
        System.out.println("----------------------");
        if (bird instanceof Flyable) {
            ((Flyable) bird).fly();
            ((Flyable) bird).subFly();
            ((Flyable) bird).supFly();
        } else {
            System.out.println("������ﲻ�ܷ�");
        }
    }
}
