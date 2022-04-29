package com.ujiuye.Day04.Day04_practice.Demo;

import javax.swing.*;
import java.util.Scanner;

public class Demo3 {

    public static void main(String[] args) {

        System.out.println("输入你的工资");
        int wage = new Scanner(System.in).nextInt();

        //计算税后薪酬

        double wage_Aftertax=0.0,tax=0.0;

        if(wage <= 5000) {
            tax = 0;
            wage_Aftertax = wage - tax;
        }else if (wage >= 5000 && wage<=12000) {
            tax = (wage-5000) * 0.1;
            wage_Aftertax = wage - tax;
        }else if(wage>12000&&wage<=25000){
            tax = (12000-5000) * 0.1+(wage-12000)*0.2;
            wage_Aftertax = wage - tax;
        }else if(wage>25000&&wage<=35000){
            tax = (12000-5000) * 0.1+(25000-12000)*0.2+(wage-35000)*0.25;
            wage_Aftertax = wage - tax;
        }else if(wage>35000&&wage<=55000){
            tax = (12000-5000) * 0.1+(25000-12000)*0.2+(35000-12000)*0.25+(wage-35000)*0.3;
            wage_Aftertax = wage - tax;
        }else if(wage>55000&&wage<=80000) {
            tax = (12000 - 5000) * 0.1 + (25000 - 12000) * 0.2 + (35000 - 12000) * 0.25 + (55000 - 35000) * 0.3 + (wage - 55000) * 0.35;
            wage_Aftertax = wage - tax;
        }else if(wage>80000) {
            tax = (12000 - 5000) * 0.1 + (25000 - 12000) * 0.2 + (35000 - 12000) * 0.25 + (55000 - 35000) * 0.3 + (80000 - 55000) * 0.35 + (wage - 80000) * 0.4;
            wage_Aftertax = wage - tax;
        }else{}

        System.out.println("你需要交税"+tax+"元，"+"税后薪资为："+wage_Aftertax);
    }
}
