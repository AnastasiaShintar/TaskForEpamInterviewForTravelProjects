package com.epam.shintar.sorter;

import com.epam.shintar.sorter.customComparator.ABCOrderComparator;
import com.epam.shintar.sorter.customComparator.PriceComparator;
import com.epam.shintar.sorter.customComparator.RatingComparator;
import com.epam.shintar.entity.Hotel;

import java.util.Collections;
import java.util.List;

public class HotelSorter {

    RatingComparator ratingComparator = new RatingComparator();
    PriceComparator priceComparator = new PriceComparator();
    ABCOrderComparator abcOrderComparator = new ABCOrderComparator();


    public List<Hotel> sortHotelsByTopRating(List<Hotel> hotelList) {
        Collections.sort(hotelList, ratingComparator);
        return hotelList;
    }

    public List<Hotel> sortHotelsByPrice(List<Hotel> hotelList) {
        Collections.sort(hotelList, priceComparator);
        return hotelList;
    }

    public List<Hotel> sortHotelsByAlphabetOrder(List<Hotel> hotelList) {
        Collections.sort(hotelList, abcOrderComparator);
        return hotelList;
    }
}
