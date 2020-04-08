package ru.julia;

public class OneTimeEarlyPayment {
    private final int oneTimeEarlyPaymentAmount;
    private final int oneTimeEarlyPaymentMonth;

    public int getOneTimeEarlyPaymentAmount() {
        return oneTimeEarlyPaymentAmount;
    }

    public int getOneTimeEarlyPaymentMonth() {
        return oneTimeEarlyPaymentMonth;
    }

    public OneTimeEarlyPayment(int oneTimeEarlyPaymentAmount, int oneTimeEarlyPaymentMonth) {
        this.oneTimeEarlyPaymentAmount = oneTimeEarlyPaymentAmount;
        this.oneTimeEarlyPaymentMonth = oneTimeEarlyPaymentMonth;
    }
}
