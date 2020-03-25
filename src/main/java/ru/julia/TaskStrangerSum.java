package ru.julia;

/**
 * Для чисел от 1 до 100 посчитать сколько получится, если писать 1 - 2 + 3 - 4 и так далее.
 */
public class TaskStrangerSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 101; i = i + 2) {
            sum = sum + i - (i + 1);
            System.out.println(sum);
        }
    }
}
