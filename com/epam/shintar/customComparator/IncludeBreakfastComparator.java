package com.epam.shintar.customComparator;

import com.epam.shintar.entity.Hotel;

import java.util.Comparator;

public class IncludeBreakfastComparator implements Comparator<Hotel> {
    @Override
    public int compare(Hotel o1, Hotel o2) {
        return o1.getBreakfast().compareTo(o2.getBreakfast());
    }
}
