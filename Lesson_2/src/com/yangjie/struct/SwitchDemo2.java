package com.yangjie.struct;

public class SwitchDemo2 {
    public static void main(String[] args) {
        String name = "杨杰";
        //字符的本质还是数字

        //反编译 java文件---->class(字节码文件)---->反编译（IDE）
        // file---->project structure---->project
        switch (name){
            case "杨杰":
                System.out.println("杨杰");
                break;
            case "彭倩":
                System.out.println("彭倩");
                break;
            default:
                System.out.println("未匹配");
        }
    }
}
