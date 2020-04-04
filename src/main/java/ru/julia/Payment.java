package ru.julia;

public class Payment {
    private final int currentYear;
    private final int monthNumber;
    private final int monthlyPayment;
    private final int currentMonth;

    public int getCurrentYear() {
        return currentYear;
    }

    public int getMonthNumber() {
        return monthNumber;
    }


    public int getMonthlyPayment() {
        return monthlyPayment;
    }

    public int getCurrentMonth() {
        return currentMonth;
    }

    public Payment(int currentYear, int monthNumber, int monthlyPayment, int currentMonth) {
        this.currentYear = currentYear;
        this.monthNumber = monthNumber;
        this.monthlyPayment = monthlyPayment;
        this.currentMonth = currentMonth;
    }
    public String whatMonth() {
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
