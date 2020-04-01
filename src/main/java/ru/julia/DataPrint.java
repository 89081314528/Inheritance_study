package ru.julia;

/**
 * дан текущий год и месяц в виде 03.2020 и количество месяцев, в течение которых нужно платить кредит и сумма платежа
 * распечатать год, месяц словами, ежемесячный платеж
 * между годами разделитель ---------
 */
public class DataPrint {
    public static void main(String[] args) {
        int startYear = 2020;
        int startMonth = 4;
        int numberOfMonth = 45;
        int monthlyPayment = 16805;
        int countYear = 0;
        int currentYear = 0;
        for (int currentMonth = startMonth; currentMonth < numberOfMonth + startMonth; currentMonth++) {
            if ((currentMonth - 1) % 12 == 0) {
                countYear = countYear + 1;
            }
            currentYear = startYear + countYear;
            if (currentMonth % 12 == 1) {
                System.out.println(currentYear + " january " + monthlyPayment);
            } else if (currentMonth % 12 == 2) {
                System.out.println(currentYear + " february " + monthlyPayment);
            } else if (currentMonth % 12 == 3) {
                System.out.println(currentYear + " march " + monthlyPayment);
            } else if (currentMonth % 12 == 4) {
                System.out.println(currentYear + " april " + monthlyPayment);
            } else if (currentMonth % 12 == 5) {
                System.out.println(currentYear + " may " + monthlyPayment);
            } else if (currentMonth % 12 == 6) {
                System.out.println(currentYear + " june " + monthlyPayment);
            } else if (currentMonth % 12 == 7) {
                System.out.println(currentYear + " july " + monthlyPayment);
            } else if (currentMonth % 12 == 8) {
                System.out.println(currentYear + " august " + monthlyPayment);
            } else if (currentMonth % 12 == 9) {
                System.out.println(currentYear + " september " + monthlyPayment);
            } else if (currentMonth % 12 == 10) {
                System.out.println(currentYear + " october " + monthlyPayment);
            } else if (currentMonth % 12 == 11) {
                System.out.println(currentYear + " november " + monthlyPayment);
            } else {
                System.out.println(currentYear + " december " + monthlyPayment);
                System.out.println("----------------------------------");
            }
        }
    }
}
