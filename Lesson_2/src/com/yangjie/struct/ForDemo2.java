package com.yangjie.struct;

public class ForDemo2 {
    public static void main(String[] args) {
        //练习1:计算0到100之间的奇数和偶数的和
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0;i<=100;i++){
            if(i%2==0){
                evenSum+= i; //偶数的和
            }else{
                oddSum+=i;//奇数的和
            }

        }
        System.out.println("奇数的和："+oddSum);
        System.out.println("偶数的和"+evenSum);
    }
}
