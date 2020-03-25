package ru.julia;

import java.math.BigInteger;

/**
 * Посчитать сумму геометрической прогрессии для чисел от 0 до 100
 */

public class TaskEasySum {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("2");
        BigInteger sum = a;
//        System.out.println(sum);
//        sum = sum.add(b);
//        System.out.println(sum);
        for (int i = 0; i < 100; i++) {
            a = a.multiply(b);
            System.out.println(a);
            sum = sum.add(a);
            System.out.println("sum = " + sum);
        }
    }
}
