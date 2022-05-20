package com.test.src;

/**
 * time :2022/5/6 17:09 26
 * ClassName :PackageTest03
 * Package :com.test.src
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class PackageTest03 {
    public static void main(String[] args) {
//        不使用导包，可以这样创建一个对象，要通过包文件找到对应的内容
        com.test.src.Package p = new com.test.src.Package();
    }
}
