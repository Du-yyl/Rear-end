package String;

/**
 * time :2022/5/8 17:25 01
 * ClassName :StringTest01
 * Package :String
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class StringTest01 {
    /*
        关于Java JDK中内置的一个类：java.lang.String
        1、String表示字符串类型，属于引用数据类型，不属于基本数据类型。
        2、在java中随便使用双引号括起来的都是String对象。例如："abc"，"def"，"hello world!"，这是3个String对象。
        3、java中规定，双引号括起来的字符串，是不可变的，也就是说"abc"自出生到最终死亡，不可变，不能变成"abcd"，也不能变成"ab"
        4、在JDK当中双引号括起来的字符串，例如："abc" "def"都是直接存储在“方法区”的“字符串常量池”当中的。
            为什么SUN公司把字符串存储在一个“字符串常量池”当中呢。因为字符串在实际的开发中使用太频繁。为了执行效率，
            所以把字符串放到了方法区的字符串常量池当中。
        */
    public static void main(String[] args) {

//        这里通过双引号声明的字符串直接会保存在 Java 的方法区内存的常量池中，如果使用同一个字符串，直接使用常量池中的内容
        String str1 = "abc";
        String str2 = "123";
//        这里实际创建了3个字符串对象，并且通过拼接，创建了一个新的字符串对象
        String str3 = "abc" + "123";
//        这里使用了新建的字符串对象，这个内容直接被放置在方法区内存中，如果创建一个一样的内容，会直接使用方法区内存中的对象
//        所以内存地址相同，内容完全一样
        System.out.println(str3 == "abc123");

//        这里的’abc‘也是使用的是常量池中的内容，但是因为使用了 new ，在堆内存中创建了一个全新的对象，所以这个内容保存在堆内存中
        String str4 = new String("abc");

    }
}
