package reflect;

import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
//        资源绑定器，只能绑定 properties 文件，并且这个文件必须在类路径下，文件扩展名必须是 properties
//        并且路径中的路径中文件扩展名不能写
        ResourceBundle bundle = ResourceBundle.getBundle("classinfo2");
        String s = bundle.getString("className");
        System.out.println(s);
    }
}
