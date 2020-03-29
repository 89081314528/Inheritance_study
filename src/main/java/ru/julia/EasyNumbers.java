package ru.julia;

/**
 * Простое число это такое число, которое не делится ни на какое другое число нацело.
 * Написать программу, которая будет определять простое число в переменной или нет.
 */

public class EasyNumbers {
    public static void main(String[] args) {
        int a = 13;
        System.out.println(prostoeChislo(a));
    }

    public static boolean prostoeChislo(int chislo) {
        int count = 0;
        for (int i = 2; i < chislo; i++) {
            if (chislo % i == 0) {
                count = count + 1;
                if (count > 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
