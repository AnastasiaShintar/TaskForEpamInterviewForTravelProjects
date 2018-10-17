package com.epam.shintar.customComparator;

import com.epam.shintar.entity.Hotel;

import java.util.Comparator;

public class ABCOrderComparator implements Comparator<Hotel> {
    @Override
    public int compare(Hotel o1, Hotel o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
