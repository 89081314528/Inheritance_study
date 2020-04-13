package ru.julia;

import java.util.List;

/**
 *  Теперь возьми и сделай объект у которого поля - листы интов
 *  Сделай массив этих объектов
 *  А дальше такую же программу как предыдущая
 *  Надо писать в соответствующий элемент массива объект в котором лист с цифрам от нули до нуля
 */
public class MassivAndList {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(
                10, 40, 30, 20);
        List <ListIntov> listIntovs = List.of(
                new ListIntov(list1),
                new ListIntov(list1),
                new ListIntov(list1));
    }
}
