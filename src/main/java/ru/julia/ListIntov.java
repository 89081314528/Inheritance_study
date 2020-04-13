package ru.julia;

import java.util.List;

public class ListIntov {
    private final List<Integer> list1;
    private final List<Integer> list2;
    private final List<Integer> list3;


    public List<Integer> getList1() {
        return list1;
    }

    public List<Integer> getList2() {
        return list2;
    }

    public List<Integer> getList3() {
        return list3;
    }

    public ListIntov(List<Integer> list1, List<Integer> list2, List<Integer> list3) {
        this.list1 = list1;
        this.list2 = list2;
        this.list3 = list3;
    }
}
