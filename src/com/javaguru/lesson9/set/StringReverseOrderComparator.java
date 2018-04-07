package com.javaguru.lesson9.set;

import java.util.Comparator;

class StringReverseOrderComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
