package ru.julia;
/**
 * есть массив чисел и нулей. создать новый массив, нужно в первый элемент положить сумму числел до 1 нуля,
 * во второй от нуля до следующего нуля и так далее, оставшиеся элементы заполнить нулями
 *
 */
public class Massiv {
    public static void main(String[] args) {
        int massivSize = 50;
        Integer[] massiv = new Integer[massivSize];
        Integer[] massivSum = new Integer[massivSize];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = (int) (Math.random() * 10);
            System.out.print(massiv[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < massivSum.length; i++) {
            massivSum[i] = 0;
            System.out.print(massivSum[i] + " ");
        }
        System.out.println();
        int numberInMassivSum = 0;
        int sum = 0;
        int countNul = 0;
        int lastNul = 0;
        for (int i = 0; i < massiv.length; i++) {
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
        if (lastNul < (massiv.length - 1) || countNul == 0) {
            massivSum[numberInMassivSum] = sum;
        }
        System.out.println("Количество нулей " + countNul);
        System.out.println("Номер последнего нуля " + lastNul);
        for (int i = 0; i < massivSum.length; i++) {
            System.out.print(massivSum[i] + " ");
        }
    }
}
