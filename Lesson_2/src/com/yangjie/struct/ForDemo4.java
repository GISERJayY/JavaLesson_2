package com.yangjie.struct;

public class ForDemo4 {
    //1.我们先打印第一列
    //2.我们把固定的1再用一个循环包起来
    //3.去掉重复 i<=j
    //4.调整样式
    public static void main(String[] args) {
        for(int j = 1;j<=9;j++){
            for(int i = 1;i<=j;i++){
                System.out.print(j+"*"+i +"="+(j*i)+"\t ");
            }
            System.out.println();
        }


    }
}
