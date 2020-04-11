package ru.julia;

/**
 * есть массив чисел и нулей. есть лист - нужно в первый элемент листа положить сумму числел до 1 нуля.
 * 2 вариантт - с массивом из 100 элементов. лишние - нули.
 */
public class Massiv {
    public static void main(String[] args) {
       Integer [] massiv = new Integer[50];
       Integer [] massivSum = new Integer[50];
        for (int i = 0; i < 50; i++) {
            massiv[i] = (int)(Math.random() * 10);
            System.out.print(massiv[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 50; i++) {
            massivSum[i] = 0;
            System.out.print(massivSum[i] + " ");
        }
        System.out.println();
        int numberInMassivSum = 0;
        int sum = 0;
        int countNul = 0;
        int lastNul = 0;
        for (int i = 0; i < 50; i++) {
            if (massiv[i] == 0) {
                countNul = countNul + 1;
                lastNul = i;
            }
            sum = sum + massiv[i];
            if (massiv[i] == 0 && sum > 0) {
                massivSum[numberInMassivSum] = sum;
                numberInMassivSum = numberInMassivSum + 1;
                sum = 0;
            }
        }
        if (lastNul < 49 || countNul == 0) {
            massivSum[numberInMassivSum] = sum;
        }
        System.out.println("Количество нулей " + countNul);
        System.out.println("Номер последнего нуля " + lastNul);
        for (int i = 0; i < 50; i++) {
            System.out.print(massivSum[i] + " ");
        }
    }
}
