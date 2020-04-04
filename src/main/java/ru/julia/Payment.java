package ru.julia;

public class Payment {
    final int currentYear;
    final int monthNumber;
    final int monthlyPayment;
    final int currentMonth;

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
}
