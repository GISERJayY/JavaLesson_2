package com.yangjie.struct;

public class WhileDemo3 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i<=100){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
