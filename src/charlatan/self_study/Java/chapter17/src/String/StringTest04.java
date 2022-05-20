package String;

/**
 * time :2022/5/8 19:43 46
 * ClassName :StringTest04
 * Package :String
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class StringTest04 {
    public static void main(String[] args) {
        String str1 = "测试字符串";
        /*
        char    charAt(int index)
                返回 char指定索引处的值。
         */
        System.out.println(str1.charAt(1)); // 试
        System.out.println(str1.charAt(2)); // 字
        System.out.println(str1.charAt(3)); // 符

        /*
        int     codePointAt(int index)
                返回指定索引处的字符（Unicode代码点）。
         */
        System.out.println(str1.codePointAt(1)); // 35797
        System.out.println(str1.codePointAt(2)); // 23383
        System.out.println(str1.codePointAt(3)); // 31526

        /*
        int     compareTo(String anotherString)
                按字典顺序比较两个字符串。
        如果字符串完全相等，返回 0
        对比顺序会按照下标顺序进行对比，如果第一个相等，继续向下对比，直到比出大小为止，
        如果左边大，返回 1
        如果右边大，返回 -1
        如果相等，返回 0
         */
        System.out.println("abcd".compareTo("abcd")); // 0
        System.out.println("abcd".compareTo("abce")); // -1
        System.out.println("abce".compareTo("abcd")); // 1
        System.out.println("abcd".compareTo("bacd")); // -1

        /*
        String  concat(String str)
                将指定的字符串连接到该字符串的末尾。
         */
        System.out.println(str1.concat(str1));
        System.out.println("测试".concat("内容"));

        /*
        boolean     contains(CharSequence s)
                    判断一个字符串中是否包含指定的字符串
         */
        System.out.println("测试内容".contains("测试"));
        System.out.println("测试内容".contains("测试1"));

        /*
        boolean     endsWith(String suffix)
                    测试此字符串是否以指定的后缀结尾。
         */
        System.out.println("test.java".endsWith(".java"));
        System.out.println("test.txt".endsWith(".java"));

        /*
        boolean     equals(Object anObject)
                    将此字符串与指定对象进行比较。
         */
        System.out.println("测试内容".equals("测试内容"));
        System.out.println("测试".equals("测试1"));

        /*
        boolean     equalsIgnoreCase(String anotherString)
                    比较两个字符串是否相等，忽略大小写
         */
        System.out.println("ABC".equalsIgnoreCase("abc"));

        /*
        byte[]  getBytes()
                将字符串转换为字节的数组。
         */
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        /*
        int     hashCode()
                返回此字符串的哈希码。
         */
        System.out.println("测试".hashCode());

        /*
        int     indexOf(int ch)
                返回指定字符第一次出现的字符串内的索引。
         */
        System.out.println("abcdefg".indexOf('b'));

        /*
        int     indexOf(int ch, int fromIndex)
                返回指定字符第一次出现的字符串内的索引，以指定的索引开始搜索。
         */
        System.out.println("abcabc".indexOf('c', 2));

        /*
        int     indexOf(String str)
                返回指定子字符串第一次出现的字符串内的索引。
         */
        System.out.println("测试内容".indexOf("测试"));

        /*
        int     indexOf(String str, int fromIndex)
                返回指定子串的第一次出现的字符串中的索引，从指定的索引开始。
         */
        System.out.println("测试测试".indexOf("测试", 1));

        /*
        boolean     isEmpty()
                    判断一个数组是不是空的，如果是，返回 true
         */
        System.out.println("".isEmpty());
        System.out.println("不是空的".isEmpty());
        /*
        static String join(CharSequence delimiter, CharSequence... elements)
                返回一个新的字符串，由 CharSequence elements的副本组成，并附有指定的delimiter的 delimiter 。
         */
        String str2 = String.join("第一个内容", "第二个内容");
        System.out.println(str2);

        /*
        int     lastIndexOf(int ch)
                返回指定字符的最后一次出现的字符串中的索引。
         */
        System.out.println("aaaa".lastIndexOf("a"));
        /*
        int     lastIndexOf(int ch, int fromIndex)
                返回指定字符的最后一次出现的字符串中的索引，从指定的索引开始向后搜索。
         */
        System.out.println("aabcabc".lastIndexOf("a", 2));
        /*
        int     lastIndexOf(String str)
                返回指定子字符串最后一次出现的字符串中的索引。
         */
        System.out.println("测试测试测试".lastIndexOf("测试"));
        /*
        int     lastIndexOf(String str, int fromIndex)
                返回指定子字符串的最后一次出现的字符串中的索引，从指定索引开始向后搜索。
         */
        System.out.println("测试测试测试".lastIndexOf("测试", 2));
        /*
        int     length()
                返回此字符串的长度。
         */
        System.out.println("测试内容".length());

        /*
        String  replace(char oldChar, char newChar)
                替换第一个出现指定内容的字符片段，将 oldChar 替换为 newChar
         */
        System.out.println("测试内容".replace("测试", "你好"));

        /*
        String  replaceAll(String regex, String replacement)
                用给定的替换替换与给定的 regular expression匹配的此字符串的每个子字符串。
         */
        System.out.println("测试测试测试".replaceAll("测试", "你好"));

        /*
        String  replaceFirst(String regex, String replacement)
                替换第一个匹配到的元素
         */
        System.out.println("测试测试测试".replaceFirst("测试", "你好"));

        /*
        String[]    split(String regex)
                将此字符串分割为给定的 regular expression的匹配。
         */
        String[] strings = "测试测试测试".split("测");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        /*
        boolean     startsWith(String prefix)
                    测试此字符串是否以指定的前缀开头。
         */
        System.out.println("测试内容".startsWith("测试"));

        /*
        boolean     startsWith(String prefix, int toffset)
                    测试在指定索引处开始的此字符串的子字符串是否以指定的前缀开头。
         */
        System.out.println("111测试内容".startsWith("测试", 3));

        /*
        String  substring(int beginIndex)
                按照指定下标开始截取字符串
         */
        System.out.println("测试内容".substring(2));

        /*
        String  substring(int beginIndex, int endIndex)
                按照指定下标截取字符串
                含头，不含尾
         */
        System.out.println("测试内容".substring(1, 3));
        /*
        char[]  toCharArray()
                将此字符串转换为新的字符数组。
         */
        char[] chars = "测试内容".toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        /*

        String  toLowerCase()
                将所有在此字符 String使用默认语言环境的规则，以小写。
         */
        System.out.println("ABC".toLowerCase());
        /*
        String  toUpperCase()
                将所有在此字符 String使用默认语言环境的规则大写。
         */
        System.out.println("abc".toUpperCase());

        /*
        String  trim()
                返回一个字符串，其值为此字符串，并删除任何前导和尾随空格。
         */
        System.out.println("  测试  ".trim());

        /*
        static  String  valueOf(boolean b)
                将不是字符串类型的内容，转换为字符串
                如果传入的内容是一个对象，会自动调用这个对象的 toString（） 方法
         */
        System.out.println(String.valueOf(123));

        /*
        print方法底层调用了指定对象的 valueOf（）方法，并且，valueOf方法底层调用了 toString 方法，所以直接输出一个对象，
        会自动调用toString。
        并且如果输入内容，在 print 中第一步会先调用对应的 valueOf 方法，所以输入的控制台的都是字符串
         */
        System.out.println(new Object());
    }
}
