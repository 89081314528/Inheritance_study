package ru.julia;

public class Main {
    public static void main(String[] args) {
        int t = 2; // в переменной примитивного типа находится значение 2
        String e = "cat"; // в переменной непримитивного типа находится ссылка на объект. Переменная непримитивного типа
        // это класс
        Object q = new Object();
        Object w = new Object();
        System.out.println(q.equals(w)); // equals сравнивает ссылки у обджекта
        q = w;
        System.out.println(q.equals(w));
        String a = "cat";
        String b = "cat";
        System.out.println(a.equals(b)); // equals сравнивает содержимое у стринга
        Person person = new Person("Ilya", 37);
        Person person2 = new Person("Ilya", 37);
//        person = person2;
//        person.age = 18;
        printObgect(person);
        printObgect(person2);
// сначала equals у персон мы не переопределяли, поэтому он пользуется методом из обджекта который сравнивает ссылки
// теперь переопределили и он сравнивает содержимое
        if (person.equals(person2)) {
            System.out.println("равны");
        } else {
            System.out.println(person.toString());
            System.out.println("не равны");
            System.out.println(person2.toString());
        }
        System.out.println(person.equals(person2));
    }

    public static void printObgect(Object object) {
        System.out.println(object.toString());
    }
}
