package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator comparator = new ListComparator();

        sourceList.sort(comparator);
        System.out.println(sourceList);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int a2 = Integer.parseInt(a)*Integer.parseInt(a);
        int b2 = Integer.parseInt(b)*Integer.parseInt(b);
        return Integer.compare(a2, b2);
    }
}
