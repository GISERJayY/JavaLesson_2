package com.yangjie.Scanner;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文字：");
        if(scanner.hasNextLine()){
            String a  = scanner.nextLine();
            System.out.println("输入的文字是："+a);
        }

        scanner.close();

    }
}
