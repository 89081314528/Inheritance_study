package ru.julia;

public class TaskStrangerSum3 {
    public static void main(String[] args) {
        int [] massiv = new int[11];
        for (int i = 1; i < 11; i++) {
            massiv[i] = i;
//            System.out.println(massiv[i]);
        }
        for (int i = 3; i < 11; i = i + 2) {
            massiv[i] = massiv[i] * (-1);
        }
        for (int i = 1; i < 11; i++) {
            System.out.println(massiv[i]);
        }
        int sum = 0;
        for (int i = 1; i < 11 ; i++) {
            sum = sum + massiv[i];
        }
        System.out.println("sum = " + sum);
    }
}
