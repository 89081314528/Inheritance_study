package ru.julia;

public class Product {
    private final String name;
    private final int calories;

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public Product(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }
}
