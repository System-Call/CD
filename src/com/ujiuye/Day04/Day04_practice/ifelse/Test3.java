package com.ujiuye.Day04.Day04_practice.ifelse;

public class Test3 {
    public static void main(String[] args) {

        int a = -1;

        if(a <= 3 && a >=1){

            System.out.println("春季");
        }else if(a <= 6 && a > 3){

            System.out.println("夏季");
        }else if (a <= 9 && a > 6){

            System.out.println("秋季");
        }else if(a <= 12 && a > 9){
            System.out.println("冬季");
        }else{
            System.out.println("输入有误");
        }
    }

}
