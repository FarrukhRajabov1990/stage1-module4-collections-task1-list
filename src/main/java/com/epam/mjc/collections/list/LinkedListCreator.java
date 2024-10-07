package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {

        LinkedList<Integer> calculatedList = new LinkedList<>();

        for (Integer integer : sourceList) {
            if (integer % 2 != 0) {
                calculatedList.addFirst(integer);
            } else {
                calculatedList.addLast(integer);
            }
        }

        return calculatedList;
    }
}
