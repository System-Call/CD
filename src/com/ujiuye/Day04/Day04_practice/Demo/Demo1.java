package com.ujiuye.Day04.Day04_practice.Demo;

import java.util.Scanner;

public class Demo1 {

    private static double Infinity;

    public static void main(String[] args) {
        //获取身高体重
        System.out.println("请输入体重(kg)");
        double weight = new Scanner(System.in).nextDouble();
        System.out.println("请输入身高(m)");
        double high = new Scanner(System.in).nextDouble();
        byte flag = 0;
        //计算BIM
        double bmi = weight / (high * high);
        String result_Type = "";
        if (bmi == 0 ||bmi == Infinity) {
            flag = 1;
        }
        if (bmi <= 18.5) {
            result_Type = "过轻";
        } else if (bmi <= 22.9) {
            result_Type = "正常";
        } else if (bmi <= 24.9) {
            result_Type = "偏胖";
        } else if (bmi <= 29.9) {
            result_Type = "肥胖";
        } else if (bmi <= 40) {
            result_Type = "重度肥胖";
        } else if (bmi > 40) {
            result_Type = "极度肥胖";
        } else {
            flag = 1;
        }

        if (flag == 0) {
            System.out.println("你的BMI评级为：" + result_Type);
        } else {
            System.out.println("你的输入有误");
        }
        System.out.println(bmi);
        //没有排除身高0值的影响

    }
}
