package com.yangjie.struct;

public class ForDemo1 {
    public static void main(String[] args) {
        int a = 1;//初始条件
        while (a<=100){
            System.out.println(a);
            a = ++a;
        }
        System.out.println("whil循环结束");

        for (int i=1;i<=100;i=++i){
            System.out.println(i);

        }
        System.out.println("for循环结束");
        /*
        关于for语句的几点说明
        最先执行初始化步骤。可以声明一种类型，但可以初始化一个或多个循环控制变量，也可以空语句。
        然后检测布尔表达式的值，如果是true，循环体被执行，如果是false，循环体终止，开始执行循环体后面的语句。
        执行一次循环后，更新循环控制变量（迭代因子控制循环变量的增加）
        再次检测布尔表达式，循环执行上面的过程。
         */
    }

}
