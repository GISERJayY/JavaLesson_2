package com.yangjie.Scanner;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        //创建一个扫描对象，用于收集键盘数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用next方式接收：");
        //判断用户有没有输入字符串
        if (scanner.hasNext()) {
            //用next()方法接收
            String a = scanner.next();
            System.out.println("输入内容是："+a);
        }
        scanner.close();
    }
}
