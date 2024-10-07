package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {

        ArrayList<String> duplicatedWords = new ArrayList<>();
        for (int i=0; i<sourceList.size(); i++) {
            if ((i+1)%3 == 0) {
                duplicatedWords.add(sourceList.get(i));
                duplicatedWords.add(sourceList.get(i));
            }
        }

        return duplicatedWords;
    }
}
