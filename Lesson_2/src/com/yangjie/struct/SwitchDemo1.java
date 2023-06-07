package com.yangjie.struct;

public class SwitchDemo1 {
    public static void main(String[] args) {
        char grad = 'h';
        //case穿透 // 匹配一个具体值
        switch (grad){
            case 'a':
                System.out.println("优秀");
                break;//可选
            case 'b':
                System.out.println("良好");
                break;
            case 'c':
                System.out.println("及格");
                break;
            case 'd':
                System.out.println("再接再厉");
                break;
            case 'e':
                System.out.println("挂科");
                break;
            default:
                System.out.println("未知等级");
        }
    }
}
