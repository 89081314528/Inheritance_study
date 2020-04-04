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
}
