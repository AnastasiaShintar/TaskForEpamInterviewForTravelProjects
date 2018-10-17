package com.epam.shintar.customComparator;

import com.epam.shintar.entity.Hotel;
import java.util.Comparator;

public class PriceComparator implements Comparator<Hotel> {
    @Override
    public int compare(Hotel o1, Hotel o2) {
        if(o1.getPrice()>o2.getPrice()){
            return 1;
        }else if (o1.getPrice()<o2.getPrice()){
            return -1;
        }else {
            return 0;
        }
    }
}
