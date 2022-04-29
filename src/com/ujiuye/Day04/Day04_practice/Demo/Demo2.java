package com.ujiuye.Day04.Day04_practice.Demo;

import java.util.Scanner;

//最大公约数和最小公倍数
public class Demo2 {

    public static int max_Dnum(int a, int b){
        //返回最大公约数
        for(int i = Math.min(a,b);i >= 1 ;i--) {

            if (a % i ==0 && b % i ==0){
                return i;
            }
        }
        return 0;
    }

    public static int min_Dnum(int a, int b){
       // 最小公倍数
        for (int i = Math.max(a,b);i <=a * b; i++) {
            if(i % a == 0 && i % b == 0) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.println("输入第一个数");
        int a = new Scanner(System.in).nextInt();
        System.out.println("输入第二个数");
        int b = new Scanner(System.in).nextInt();

        System.out.println("最大公约数是："+max_Dnum(a,b)+","+"最小公倍数是："+min_Dnum(a,b));
    }


}
