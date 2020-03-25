package ru.julia;

import java.math.BigInteger;

/**
 * Посчитать сумму геометрической прогрессии для чисел от 0 до 100
 */

public class TaskEasySum {
    public static void main(String[] args) {
        BigInteger chlen = new BigInteger("1");
        BigInteger mnozitel = new BigInteger("2");
        BigInteger sum = chlen;
//        System.out.println(sum);
//        sum = sum.add(mnozitel);
//        System.out.println(sum);
        for (int i = 0; i < 100; i++) {
            chlen = chlen.multiply(mnozitel);
            System.out.println(chlen);
            sum = sum.add(chlen);
            System.out.println("sum = " + sum);
        }
    }
}
