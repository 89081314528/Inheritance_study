package ru.julia;
/**
 4) Бой джедаев и ситхов
 * Джедай и ситх сошлись в смертельном поединке.
 * Известно, что если ситх стоит выше джедая, ситх проиграет. Если джедай стоит выше ситха, джедай выигрывает. Если ситх и джедай на одной высоте, победа остаётся за ситхом.
 * Но из этого правила есть исключения. Ситх Палпатин выигрывает всегда. Джедай Оби Ван выигрырывает у ситха Дарта Мола даже если они стоят на одной и той же высоте.
 * Если у джедая будет программа, которая сможет в зависимости от положения соперников и их имён определить итог схватки, джедаи смогут не вступать в заведомо проигрышные поединки.
 * Нужно написать такую программу и помочь джедаям в их борьбе со злом!
 */

public class TaskAboutDjedaiVsSithi {
    public static void main(String[] args) {
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
        } else {
            System.out.println("Выиграл ситх");
        }
    }
}
