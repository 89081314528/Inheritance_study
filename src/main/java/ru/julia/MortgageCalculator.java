package ru.julia;

/**
 * есть сумма кредита, срок в месяцах и процентная ставка
 * распечатать график платежей, с делением на сумму долга и проценты
 * 3 варианта досрочного погашения - каждый месяц, в конкретный месяц, в комбинации
 * вывод - проценты, долг, платеж и сумма досрочного погашения в этом месяце
 * дз:
 * 1) объединить две задачи - потом
 */
public class MortgageCalculator {
    public static void main(String[] args) {
        int loanDebt = 12000;
        double interestRate = 0.1;
        double monthInterestRate = interestRate / 12;
        double loanTerm = 12;
        double monthlyPayment = loanDebt * monthInterestRate / (1 - Math.pow(1 + monthInterestRate, -loanTerm));
        System.out.println("Ежемесячный платеж " + Math.rint(100 * monthlyPayment) / 100);
//        System.out.println("Переплата по кредиту " + Math.rint(100 * (monthlyPayment * loanTerm - loanDebt) / 100));
        double currentLoanAmount = loanDebt;
        double monthlyEarlyPayment = 1000;
        // предполагаем, что ежемесячное досрочное погашение начинается с февраля
        //1 это февраль. предполагаем, что погашение происходит в начале месяца 1 числа
        OneTimeEarlyPayment[] oneTimeEarlyPayments = {
                new OneTimeEarlyPayment(2000, 0),
                new OneTimeEarlyPayment(2000, 1)};

        for (int i = 0; i < loanTerm; i++) {
            for (int a = 0; a < oneTimeEarlyPayments.length; a++) {
                OneTimeEarlyPayment payment = oneTimeEarlyPayments[a];
                if (i == payment.getOneTimeEarlyPaymentMonth()) {
                    monthlyPayment = (currentLoanAmount - payment.getOneTimeEarlyPaymentAmount()) * monthInterestRate /
                            (1 - Math.pow(1 + monthInterestRate, -(loanTerm - i)));
                    System.out.println("Разовое досрочное погашение " + payment.getOneTimeEarlyPaymentAmount());
                    currentLoanAmount = currentLoanAmount - payment.getOneTimeEarlyPaymentAmount();
                    System.out.println("Остаток основного долга " + Math.rint(100 * currentLoanAmount) / 100);
                    System.out.println("Новый ежемесячный платеж " + Math.rint(100 * monthlyPayment) / 100);
                }
            }
            double currentInterestPayment = currentLoanAmount * monthInterestRate;
            double currentLoanPayment = monthlyPayment - currentInterestPayment;
            currentLoanAmount = currentLoanAmount - currentLoanPayment;
            System.out.println("Внесен ежемесячный платеж " + Math.rint(100 * monthlyPayment) / 100 + " в т. ч проценты "
                    + Math.rint(100 * currentInterestPayment) / 100 + " основной долг " +
                    Math.rint(100 * currentLoanPayment) / 100);
            System.out.println("Остаток основного долга " + Math.rint(100 * currentLoanAmount) / 100);

            if (currentLoanAmount < monthlyEarlyPayment) {
                System.out.println("Досрочное погашение " + Math.rint(100 * currentLoanAmount) / 100);
                break;
            }
            currentLoanAmount = currentLoanAmount - monthlyEarlyPayment;
            monthlyPayment = currentLoanAmount * monthInterestRate /
                    (1 - Math.pow(1 + monthInterestRate, -(loanTerm - i - 1)));
            System.out.println("Досрочное погашение " + Math.rint(100 * monthlyEarlyPayment) / 100);
            System.out.println("Остаток основного долга " + Math.rint(100 * currentLoanAmount) / 100);
            System.out.println("Новый ежемесячный платеж " + Math.rint(100 * monthlyPayment) / 100);

        }
    }
}
