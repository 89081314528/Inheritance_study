package ru.julia;

/**
 * Для чисел от 1 до 100 посчитать сколько получится, если писать 1 + 2 - 3 + 4 и так далее.
 */
public class TaskStrangerSum {
    public static void main(String[] args) {
        int sum = 1;
        for (int i = 2; i < 101; i ++) {
            if ( i % 2 == 0) {
                sum = sum + i;
                System.out.println(sum);
            } else {
                sum = sum - i;
                System.out.println(sum);
            }
        }
        System.out.println(sum);
    }
}
