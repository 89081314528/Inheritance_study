package ru.julia;

import java.util.ArrayList;
import java.util.List;

/**
 * Теперь возьми и сделай объект у которого поля - листы интов
 * Сделай массив этих объектов
 * А дальше такую же программу как предыдущая
 * Надо писать в соответствующий элемент массива объект в котором лист с цифрам от нули до нуля
 * добавить в лист все нечетные от ноля до ста для тренировки
 */
public class MassivAndList {
    public static void main(String[] args) {
        int massiveSize = 50;
        Integer[] massiv = new Integer[massiveSize];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = (int) (Math.random() * 10);
            System.out.print(massiv[i] + " ");
        }
        System.out.println();
        List<Integer> list1 = new ArrayList<>();
        ListIntov listIntov = new ListIntov(list1);
        List <ListIntov> listIntovs = new ArrayList<>();
        for (int i = 0; i < massiv.length; i++) {
            if ((massiv[i] == 0) && (massiv[i - 1] == 0)) {     //!!!!!!!!!!!!!!!!!!!!!!! i-1
            } else if (massiv[i] == 0) {
                System.out.println(list1);
                listIntov = new ListIntov(list1);
                listIntovs.add(listIntov);
                list1 = new ArrayList<>();
            } else {
                list1.add(massiv[i]);
            }
        }
        listIntov = new ListIntov(list1);
        listIntovs.add(listIntov);
        System.out.println(list1);

        for (ListIntov currentLisIntovs : listIntovs) {
            System.out.println(currentLisIntovs.getList1());
        }
    }
}
