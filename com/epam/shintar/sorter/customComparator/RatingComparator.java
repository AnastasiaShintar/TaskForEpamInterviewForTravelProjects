package com.epam.shintar.sorter.customComparator;

import com.epam.shintar.entity.Hotel;

import java.util.Comparator;

public class RatingComparator implements Comparator<Hotel> {


    @Override
    public int compare(Hotel o1, Hotel o2) {
        if (o1.getRating() < o2.getRating()) {
            return 1;
        } else if (o1.getRating() > o2.getRating()) {
            return -1;
        } else {
            return 0;
        }
    }
}
