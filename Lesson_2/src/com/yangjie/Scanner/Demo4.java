package com.yangjie.Scanner;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        //我们可以输入多个数字，并求其总和与平均数，每输入一个数字用回车确认，通过输入非数字来结束输入，并输出结果
        Scanner scanner = new Scanner(System.in);
        //和
        double sum = 0;
        //计算输入多少个数字
        int m = 0;
        m = m++;
        //通过循环判断是否还有输入， 并在里面每一次求和
        while (scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            m = ++m;
            sum = sum + x;
        }
        System.out.println(m + "个数的和为"+ sum);
        System.out.println(m+"个数的平均数是"+(sum/m));




        scanner.close();

    }
}
