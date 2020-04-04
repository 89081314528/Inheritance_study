package ru.julia;

/**
 * дан текущий год и месяц в виде 03.2020 и количество месяцев, в течение которых нужно платить кредит и сумма платежа
 * распечатать год, месяц словами, ежемесячный платеж
 * между годами разделитель ---------
 */
public class DataPrint {
    public static void main(String[] args) {
        int startYear = 2020;
        int startMonth = 12;
        int numberOfMonth = 5;
        int monthlyPayment = 16805;
        int countYear = 0;
        for (int currentMonth = startMonth; currentMonth < numberOfMonth + startMonth; currentMonth++) {
            int currentYear = 0;
            if ((currentMonth - 1) % 12 == 0 && currentMonth > 12) {
                countYear = countYear + 1;
            }
            currentYear = startYear + countYear;
            int monthNumber = currentMonth - 12 * countYear;
            System.out.println(currentYear + " " + whatMonth(monthNumber) + " " + monthlyPayment);
            if (currentMonth % 12 == 0) {
                System.out.println("----------------------");
            }
        }
    }

    public static String whatMonth(int monthNumber) {
        if (monthNumber == 1) {
            return "january";
        } else if (monthNumber == 2) {
            return "february";
        } else if (monthNumber == 3) {
            return "march";
        } else if (monthNumber == 4) {
            return "april";
        } else if (monthNumber == 5) {
            return "may";
        } else if (monthNumber == 6) {
            return "june";
        } else if (monthNumber == 7) {
            return "july";
        } else if (monthNumber == 8) {
            return "august";
        } else if (monthNumber == 9) {
            return "september";
        } else if (monthNumber == 10) {
            return "october";
        } else if (monthNumber == 11) {
            return "november";
        } else
            return "december";
    }
}

