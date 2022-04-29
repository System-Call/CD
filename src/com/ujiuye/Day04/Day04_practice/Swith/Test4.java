package com.ujiuye.Day04.Day04_practice.Swith;

public class Test4 {

    public static void main(String[] args) {

        int score =10;
        int scores = score / 10;
        String Leve;
        if (score <= 100 && score >= 60) {

            switch (scores) {
                case 6:
                    Leve = "D";
                    break;
                case 7:
                    Leve = "C";
                    break;
                case 8:
                    Leve = "B";
                    break;
                case 9:
                    Leve = "A";
                    break;
                default:
                    Leve = "A";
            }
        } else if (scores < 6 && scores >= 0) {
            Leve = "不及格";
        } else {
            Leve = "输入有误";
        }

        System.out.println(Leve);
    }
}
