package ru.julia;

public class TaskStrangerSum4 {
    public static void main(String[] args) {
        int sum = 1;
        int mnozitel = -1;
        for (int i = 2; i < 11; i++) {
                mnozitel = mnozitel * (-1);
                sum = sum + i * mnozitel;
        }
        System.out.println("sum = " + sum);
    }
}
