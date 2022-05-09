package Integer;

/**
 * time :2022/5/9 14:52 30
 * ClassName :IntegerTest02
 * Package :Integer
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class IntegerTest02 {
    public static void main(String[] args) {
        /*
            1、8种基本数据类型对应的包装类型名是什么？
        基本数据类型              包装类型
        -------------------------------------
        byte                    java.lang.Byte（父类Number）
        short                   java.lang.Short（父类Number）
        int                     java.lang.Integer（父类Number）
        long                    java.lang.Long（父类Number）
        float                   java.lang.Float（父类Number）
        double                  java.lang.Double（父类Number）
        boolean                 java.lang.Boolean（父类Object）
        char                    java.lang.Character（父类Object）


        2、八种包装类中其中6个都是数字对应的包装类，他们的父类都是Number，可以先研究一下Number中公共的方法：
            Number是一个抽象类，无法实例化对象。
            Number类中有这样的方法：
                byte byteValue() 以 byte 形式返回指定的数值。
                abstract  double doubleValue()以 double 形式返回指定的数值。
                abstract  float floatValue()以 float 形式返回指定的数值。
                abstract  int intValue()以 int 形式返回指定的数值。
                abstract  long longValue()以 long 形式返回指定的数值。
                short shortValue()以 short 形式返回指定的数值。
                这些方法其实所有的数字包装类的子类都有，这些方法是负责拆箱的。

         */
//        创建一个对象，将指定的数字转化为对象形式，这个被称为’装箱‘
        Integer i1 = new Integer("123456");
//        将创造的对象转换为 int 类型，这个被称为’拆箱‘
//        如哦要将内容转换为数字，但是要转换的内容不符合数字要求，会直接报错
        System.out.println(i1.intValue());
        System.out.println(i1.floatValue());
        System.out.println();
    }
}
