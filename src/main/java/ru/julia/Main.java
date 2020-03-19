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
 * 2) задача про предложения о работе
 * Программисту сделали два предложения о работе. Он не может выбрать предложение исходя из предлагаемой компенсации,
 * так как путь до предполагаемых мест работы занимает разное время.
 * Для того, чтобы нормально выбрать, программист должен посчитать сколько у него будет выходить за час работы,
 * считая время, за которое он будет добираться на работу и потом с работы домой.
 * Программа должна брать из переменных информацию о ежемесячной компенсации и времени которое занимает путь
 * на работу и обратно и на основании этих данных писать какое предложение выбрать.
 * 3) Похудательная программа
 * После пропуска своих данных через программу для вычисления идеального веса, программист обнаружил, что ему надо похудеть.
 * Для того, чтобы похудеть он ведёт учёт потреблённых за день каллорий и перед тем как поесть проверяет, не перейдёт
 * ли он за дневной лимит в 1400 ккал.
 * За сегодня программист уже употребил какое-то количество каллорий.
 * На ужин у него есть выбор - съесть шоколадку на 340 ккал, тарелку каши на 250 ккал или кусок сала на 500 ккал.
 * Съесть можно только что-то одно.
 * Помоги программисту! Напиши программу, которая посмотрит, сколько каллорий программист уже употребил и скажет какое из блюд программисту можно съесть перед сном. У программиста нет предпочтений, можно выбрать любое блюдо, в котором не слишком много каллорий.
 * Если во всех блюдах слишком много каллорий, программа должна написать, что лимит каллорий на сегодня исчерпан.
 * 4) Бой джедаев и ситхов
 * Джедай и ситх сошлись в смертельном поединке.
 * Известно, что если ситх стоит выше джедая, ситх проиграет. Если джедай стоит выше ситха, джедай выигрывает. Если ситх и джедай на одной высоте, победа остаётся за ситхом.
 * Но из этого правила есть исключения. Ситх Палпатин выигрывает всегда. Джедай Оби Ван выигрырывает у ситха Дарта Мола даже если они стоят на одной и той же высоте.
 * Если у джедая будет программа, которая сможет в зависимости от положения соперников и их имён определить итог схватки, джедаи смогут не вступать в заведомо проигрышные поединки.
 * Нужно написать такую программу и помочь джедаям в их борьбе со злом!
 */
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
// 1) задача про рубашки
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
//  2) задача про предложения о работе
        int salary1 = 100000;
        int salary2 = 100001;
        int workTime = 8;
        double driveTime1 = 1;
        double driveTime2 = 1;
        double salaryPerHour1 = salary1 / (workTime + driveTime1);
        double salaryPerHour2 = salary2 / (workTime + driveTime2);
        System.out.println(salaryPerHour1);
        System.out.println(salaryPerHour2);
        if (salaryPerHour1 == salaryPerHour2) {
            System.out.println("предложения одинаковые");
        } else if (salaryPerHour1 > salaryPerHour2) {
            System.out.println("выбираем 1 предложение");
        } else {
            System.out.println("выбираем 2 предложение");
        }
        // 3) Похудательная программа
        int limit = 1400;
        int alreadyEaten = 1000;
        int chocolate = 340;
        int kasha = 250;
        int salo = 500;
        if ((alreadyEaten + chocolate) > limit) {
            System.out.println("Шоколадку есть нельзя");
        } else if ((alreadyEaten + chocolate) <= limit) {
            System.out.println("Можно сьесть шоколадку");
        }
        if ((alreadyEaten + kasha) > limit) {
            System.out.println("Кашу есть нельзя");
        } else if ((alreadyEaten + kasha) <= limit) {
            System.out.println("Можно сьесть кашу");
        }
        if ((alreadyEaten + salo) > limit) {
            System.out.println("Сало есть нельзя");
        } else if ((alreadyEaten + salo) <= limit) {
            System.out.println("Можно сьесть сало");
        }
        //4) Бой джедаев и ситхов
        boolean djedayHigherSith = false;
        boolean sithHigherDjeday = false;
        boolean sithNameIsPalpatin= false;
        boolean obiOneVsDartMole = false;
        if (obiOneVsDartMole) {
            System.out.println("Выиграл джедай");
            return;
        }
        if (sithNameIsPalpatin) {
            System.out.println("Выиграл ситх");
            return;
        }
        if ((djedayHigherSith) || (sithHigherDjeday)) {
            System.out.println("Выиграл Джедай");
        } else
        {
            System.out.println("Выиграл ситх");
        }
    }

    public static void printObgect(Object object) {
        System.out.println(object.toString());
    }
}
