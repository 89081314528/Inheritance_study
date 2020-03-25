package ru.julia;
/**
  * 1) задача про рубашки
  * Объявить целочисленную переменную, в которой цена одной рубашки без скидки.
  * Объявить целочисленную переменную, в которой количество уже выбранных рубашек.
  * Объявить целочисленную переменную, в которой количество рубашек, которые надо купить, чтобы получить скидку.
  * Объявить целочисленную переменную, в которой количество рубашек, которые надо добавить к купленным, чтобы получить скидку.
  * Нужно рассчитывать это количество исходя из значений предыдущих переменных.
  * Объявить целочисленную переменную, в которой общая цена уже выбранных рубашек без скидки. Нужно цену исходя из значений предыдущих переменных.
  * Объявить целочисленную переменную, в которой общая цена рубашек (без скидки), которые надо докупить, чтобы получить скидку. Нужно цену исходя из значений предыдущих переменных.
  * Объявить дробную переменную, в которой процент скидки.
  * Объявить дробную переменную, в которой цена всех рубашек со скидкой. Нужно цену исходя из значений предыдущих переменных.
  * Объявить дробную переменную, в которой цена одной рубашки со скидкой Нужно цену исходя из значений предыдущих переменных.
  * Объявить дробную переменную, в которой количество сэкономленных денег, если рубашки куплены со скидкой Нужно цену исходя из значений предыдущих переменных.
  * Объявить дробную переменную, в которой количество рубашек, которые из-за скидки считай получены на халяву. Нужно количество исходя из значений предыдущих переменных.
 */

public class TaskAboutShirts {
    public static void main(String[] args) {
        final int price = 3300;
        final int desiredNumber = 1;
        final int numberForSale = 2;
        final int imposeNumber = numberForSale - desiredNumber;
        final int costDesiredNumber = price * desiredNumber;
        final int costImposeNumber = price * imposeNumber;
        final double discount = 0.27;
        final double costAllWithSale = (costDesiredNumber + costImposeNumber) * (1 - discount);
        System.out.println("costAllWithSale = " + costAllWithSale);
        final double priceWithSale = costAllWithSale / (desiredNumber + imposeNumber);
        System.out.println("priceWithSale = " + priceWithSale);
        final double savedMoney = costDesiredNumber + costImposeNumber - costAllWithSale;
        System.out.println("savedMoney = " + savedMoney);
        final double freeNumber = savedMoney / price;
        System.out.println(freeNumber + " джинсов на халяву");
    }
}
