package com.yangjie.struct;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         //考试大于六十分为及格。小于六十不及格
        System.out.println("输入分数： ");
        int score = scanner.nextInt();
        if(score>=60){
            System.out.println("考试成绩及格");
        }else{
            System.out.println("不及格");
        }


        scanner.close();

    }
}
