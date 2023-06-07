package com.yangjie.struct;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        /*
        if 语句至多有一个else语句，else语句在所有else if 语句之后。
        if 语句可以有若干个else if 语句，它们必须在else语句之前。
        一旦其中一个else if 语句检测为true，其他else if 以及 else语句都将跳过执行。
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入分数： ");
        int score = scanner.nextInt();
        if(score==100){
            System.out.println("恭喜满分");
        }else if(score>=90 && score<100){
            System.out.println("A级");
        } else if (score>=80 && score<90) {
            System.out.println("B级");
        }else if (score>=70 && score<80) {
            System.out.println("C级");
        }else if (score>=60 && score<70) {
            System.out.println("D级");
        }else{
            System.out.println("成绩不及格");
        }


        scanner.close();

    }
}
