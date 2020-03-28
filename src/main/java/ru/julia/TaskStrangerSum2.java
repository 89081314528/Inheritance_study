package ru.julia;

public class TaskStrangerSum2{
    public static void main(String[] args) {
        String [] massiv = new String[19];
        Integer a = 0;
        for (Integer i = 0; i < 19; i = i + 2) {
            a = a + 1;
            massiv[i] = a.toString();
        }
        for (Integer i = 1; i < 19; i = i + 4) {
            massiv[i] = "+";
        }
        for (Integer i = 3; i < 19; i = i + 4) {
            massiv[i] = "-";
        }
        for (int i = 0; i < 19; i++) {
            System.out.print(massiv[i]);
        }
        System.out.println();
        int sum = 1;
        for (Integer i = 0; i < 19; i++) {
            if (massiv[i].equals("+")) {
                sum = sum + Integer.parseInt(massiv[i + 1]);
                System.out.println(sum);
            }
            if (massiv[i].equals("-")) {
                sum = sum - Integer.parseInt(massiv[i + 1]);
                System.out.println(sum);
            }
        }
    }
}
