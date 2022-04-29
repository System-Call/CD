package com.ujiuye.Day04.Day04_practice.Swith;

public class Test5 {
    public static void main(String[] args) {

        int m = 1;
        String E = "输入有误";
        switch (m) {
            case 1:
            case 2:
            case 3:
                E = "一";
                break;
            case 4:
            case 5:
            case 6:
                E = "二";
                break;
            case 7:
            case 8:
            case 9:
                E = "三";
                break;
            case 10:
            case 11:
            case 12:
                E = "四";
                break;
            default:
                ;
        }
        System.out.println(E);
    }
}
