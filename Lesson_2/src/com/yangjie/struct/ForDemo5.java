package com.yangjie.struct;

public class ForDemo5 {
    public static void main(String[] args) {
        int[] number = {10,20,30,40,50};//定义了一个数组
        for (int i = 0;i<5;i++){
            System.out.println(number[i]);
        }
        System.out.println("================= ");
        //遍历了数组赋予给x
        for(int x : number){
            System.out.println(x);
        }

    }
}
