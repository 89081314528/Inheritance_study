package ru.julia;

/**
 * дан текущий год и месяц в виде 03.2020 и количество месяцев, в течение которых нужно платить кредит и сумма платежа
 * распечатать год, месяц словами, ежемесячный платеж
 * между годами разделитель ---------
 */
public class DataPrint {
    public static void main(String[] args) {
        int currentYear = 2020;
        int currentMonth = 4;
        int numberOfMonth = 45;
        int monthlyPayment = 16805;
        int countYear = 0;
        for (int i = currentMonth; i < numberOfMonth + currentMonth; i++) {
            if ((i - 1) % 12 == 0) {
                countYear = countYear + 1;
            }
            if (i % 12 == 1) {
                System.out.println(currentYear + countYear + " january " + monthlyPayment);
            } else
            if (i % 12 == 2) {
                System.out.println(currentYear + countYear + " february " + monthlyPayment);
            } else
            if (i % 12 == 3) {
                System.out.println(currentYear + countYear + " march " + monthlyPayment);
            } else
            if (i % 12 == 4) {
                System.out.println(currentYear + countYear + " april " + monthlyPayment);
            } else
            if (i % 12 == 5) {
                System.out.println(currentYear + countYear + " may " + monthlyPayment);
            } else
            if (i % 12 == 6) {
                System.out.println(currentYear + countYear + " june " + monthlyPayment);
            } else
            if (i % 12 == 7) {
                System.out.println(currentYear + countYear + " july " + monthlyPayment);
            } else
            if (i % 12 == 8) {
                System.out.println(currentYear + countYear + " august " + monthlyPayment);
            } else
            if (i % 12 == 9) {
                System.out.println(currentYear + countYear + " september " + monthlyPayment);
            } else
            if (i % 12 == 10) {
                System.out.println(currentYear + countYear + " october " + monthlyPayment);
            } else
            if (i % 12 == 11) {
                System.out.println(currentYear + countYear + " november " + monthlyPayment);
            } else {
                System.out.println(currentYear + countYear + " december " + monthlyPayment);
                System.out.println("----------------------------------");
            }
        }
    }
}
