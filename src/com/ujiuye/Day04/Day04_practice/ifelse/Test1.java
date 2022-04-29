package com.ujiuye.Day04.Day04_practice.ifelse;

public class Test1 {

    public static void main(String[] args) {

        int a = 13;
        int b = 8;
        int c = 9;

        if (a > b) {

            if (a > c) {

                System.out.println("a最大");
            } else {
                System.out.println("c最大");
            }
        } else {

            if (b > c) {

                System.out.println("b最大");
            } else {
                System.out.println("c最大");
            }
        }
    }
}
