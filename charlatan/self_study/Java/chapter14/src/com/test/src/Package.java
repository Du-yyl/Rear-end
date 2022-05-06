package com.test.src;

import java.util.Scanner;

/**
 * time :2022/5/6 17:03 29
 * ClassName :Package
 * Package :PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class Package {
    public static void main(String[] args) {
        /*
        在根目录下是不用写 package 的，如果在更深的目录中，必须使用 package 进行标注，并且这句话只能出现在源代码的第一行
        如果在要使用不同文件夹中的内容，需要先导包，才能使用
         */
        System.out.println("你好，世界");
    }
}
