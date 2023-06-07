package com.yangjie.struct;

public class WhilDemo3 {
    public static void main(String[] args) {
        int i = 0;
        while (i<0){
            System.out.println(i);
        }
        System.out.println("==========");
        do {
            System.out.println(i);
        }while (i<0);
    }
}
