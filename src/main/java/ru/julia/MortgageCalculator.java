package ru.julia;

/**
 * есть сумма кредита, срок в месяцах и процентная ставка
 * распечатать график платежей, с делением на сумму долга и проценты
 * 3 варианта досрочного погашения - каждый месяц, в конкретный месяц, в комбинации
 * вывод - проценты, долг, платеж и сумма досрочного погашения в этом месяце
 */
public class MortgageCalculator {
    private static Math Precision;
    public static void main(String[] args) {
        int loanDebt = 12000;
        double interestRate = 0.1;
        double monthInterestRate = interestRate / 12;
        double loanTerm = 36;
        double monthlyPayment = loanDebt * monthInterestRate / (1 - Math.pow(1 + monthInterestRate, -loanTerm));
        System.out.println("Ежемесячный платеж " + Math.rint(100 * monthlyPayment) / 100);
        System.out.println("Переплата по кредиту " + Math.rint(100 * (monthlyPayment * loanTerm - loanDebt) / 100));
        double currentLoanAmount = loanDebt;
        for (int i = 0; i < loanTerm; i++) {
            double currentInterestPayment = currentLoanAmount * monthInterestRate;
            double currentLoanPayment = monthlyPayment - currentInterestPayment;
            currentLoanAmount = currentLoanAmount - currentLoanPayment;
            System.out.println("Проценты " + Math.rint(100 * currentInterestPayment) / 100 + " Долг " +
                    Math.rint(100 * currentLoanPayment) / 100);
        }
    }
}
