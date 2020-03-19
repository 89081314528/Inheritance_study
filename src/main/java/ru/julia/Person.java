package ru.julia;

/**
 * если в классе персон я создаю метод тустринг, то при вызове метода у объекта класса персон, будет вызываться мой метод
 * если у класса персон нет своего метода тустринг, то при вызове метода будет вызываться метод класса обджект, от которого
 * по умолчанию наследуются все классы, в том числе и мой класс персон
 * java.lang.Object@3d8c7aca полное имя класса@адрес объекта в памяти
 * equals который в обжекте сравнивает адреса
 * написать, чем переменная отличается от самого объекта (переменная это ссылка на кусок памяти, а объект содержимое куса памяти)
 * прочитать про примитивные типы, про хеш код и equals
 */
public class Person {
    final String name;
    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "имя равно " + name + " " + "а возраст равен " + age + "";
    }
// переопределить equals, чтобы он сравнивал содержимое, а не ссылки
    public boolean equals(Object a) { // чтобы переопределить метод, его нужно создать таким же, как в обджекте, то есть
        // аргумент метода equals должен быть Object
        Person d = (Person) a;
        if ((name.equals(d.name)) && ((age == d.age))) {
            return true;
        }
        return false;
    }
}
