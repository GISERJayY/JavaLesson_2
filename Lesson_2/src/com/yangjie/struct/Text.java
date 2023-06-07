package com.yangjie.struct;

public class Text {
    public static void main(String[] args) {
        //拆分思想 长方形拆分
        for (int i = 1;i<=5;i++){
            for(int j = 5;j>=i;j--){
                System.out.print(" ");
            }
            for (int c = 1;c<=i;c++){
               System.out.print("*");
           }
            for (int d = 1;d<i;d++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
