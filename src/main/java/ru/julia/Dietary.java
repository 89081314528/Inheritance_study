package ru.julia;

/**
 * класс с продуктами с названием и калорийностью. сделать массив продуктов. составить диету.
 * 1500 в день. в 1 день человек ест, во второй день продукты не должны повторяться. берем продукты по порядку и проверяем,
 * чтобы у нескольких подряд было не больше 1500 калорий.
 * 2 часть. например в первой части получилось расписание на 10 дней. надо сделать на 15.
 */
public class Dietary {
    public static void main(String[] args) {
        Product[] products = {
                new Product("eggs ", 801),
                new Product("sandvich", 200),
                new Product("kasha", 200),
                new Product("soup", 400),
                new Product("meat", 801),
                new Product("chicken", 350),
                new Product("cake", 600),
                new Product("potato", 300),
                new Product("salad", 350),
                new Product("vegetables", 300),
                new Product("apple", 100),
                new Product("plov", 400),
                new Product("lazanya", 600),
                new Product("borsh", 300),
                new Product("pirog", 400),
                new Product("shokoladocka", 300),
                new Product("orange", 200),
                new Product("cremsoup", 400),
                new Product("chahohbily", 500),
                new Product("mimoza", 500),
                new Product("seledkapodshuboy", 600),
                new Product("brendy", 300),
                new Product("beer", 300),
                new Product("icecream", 400),
        };
        int sum = 0;
        int day = 0;
        for (int i = 0; i < 24; i++) {
            if (products[i].getCalories() > 800) {
                System.out.println(products[i].getName() + " есть нельзя ");
            } else {
                sum = sum + products[i].getCalories();
                if (sum <= 800) {
                    System.out.print(products[i].getName() + " " + products[i].getCalories() + " ");
                }
                if (sum > 800) {
                    day = day + 1;
                    System.out.println("Итого " + (sum - products[i].getCalories()) + " день " + day);
                    sum = 0;
                    i = i - 1;
                }
            }
        }
    }
}
