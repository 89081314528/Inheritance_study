package ru.julia;

/**
 * В его запасе 100 килограммов гречки. Хранение одного килограмма в месяц стоит 100 рублей.
 * Плата вносится за месяц вперёд. За месяц Василий съедает примерно 6 килограммов гречки.
 * Каждый месяц Василий платит за хранение остатка. То есть в первый месяц от заплатит за 100 килограммов,
 * второй месяц за 94 и так далее, пока гречка не закончится.
 * Написать программу, которая посчитает сколько денег нужно будет Василию, чтобы оплатить хранение гречки,
 * до того момента, как он её съест.
 * Со звёздочкой. В начале задавать в переменной не сколько килограммов запас Василий, а в течение какого
 * срока он хочет питаться гречкой и рассчитывать остальное исходя из этого.
 */
public class ZapasyGrechki {
    public static void main(String[] args) {
        int initialStockKg = 100;
        int costStorageOneKgPerMonth = 100;
        int eatPerMonthKg = 6;
        int numberOfMonth = 3;
        System.out.println(allCostStorage(initialStockKg,eatPerMonthKg,costStorageOneKgPerMonth));
        System.out.println(allCostStorage2(numberOfMonth,eatPerMonthKg,costStorageOneKgPerMonth));
    }
    public static int allCostStorage(int initialStock, int eatPerMonthKg, int costStorageOneKgPerMonth) {
        int allCostStorage = 0;
        for (int i = initialStock; i > 0; i = i - eatPerMonthKg) {
            allCostStorage = allCostStorage + i * costStorageOneKgPerMonth;
        }
        return allCostStorage;
    }
    public static int allCostStorage2(int numberOfMonth, int eatPerMonthKg, int costStorageOneKgPerMonth) {
        int allCostStorage = 0;
        for (int i = numberOfMonth * eatPerMonthKg; i > 0; i = i - 6) {
            allCostStorage = allCostStorage + i * costStorageOneKgPerMonth;
        }
        return allCostStorage;
    }
}
