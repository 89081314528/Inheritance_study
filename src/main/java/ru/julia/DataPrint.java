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
        for (int currentMonth = startMonth; currentMonth < numberOfMonth + startMonth; currentMonth++) {
            int currentYear = 0;
            if ((currentMonth - 1) % 12 == 0) {
                countYear = countYear + 1;
            }
            currentYear = startYear + countYear;
            System.out.println(currentYear + whatMonth(currentMonth) + monthlyPayment);
            if (currentMonth % 12 == 0) {
                System.out.println("----------------------");
            }
        }
    }

    public static String whatMonth(int currentMonth) {
        if (currentMonth % 12 == 1) {
            return " january ";
        } else if (currentMonth % 12 == 2) {
            return " february ";
        } else if (currentMonth % 12 == 3) {
            return " march ";
        } else if (currentMonth % 12 == 4) {
            return " april ";
        } else if (currentMonth % 12 == 5) {
            return " may ";
        } else if (currentMonth % 12 == 6) {
            return " june ";
        } else if (currentMonth % 12 == 7) {
            return " july ";
        } else if (currentMonth % 12 == 8) {
            return " august ";
        } else if (currentMonth % 12 == 9) {
            return " september ";
        } else if (currentMonth % 12 == 10) {
            return " october ";
        } else if (currentMonth % 12 == 11) {
            return " november ";
        } else
            return " december ";
    }
}

