package com.epam.shintar.sorter;

import com.epam.shintar.customComparator.ABCOrderComparator;
import com.epam.shintar.customComparator.IncludeBreakfastComparator;
import com.epam.shintar.customComparator.PriceComparator;
import com.epam.shintar.customComparator.RatingComparator;
import com.epam.shintar.entity.Hotel;

import java.util.Collections;
import java.util.List;

public class HotelSorter {

    RatingComparator ratingComparator = new RatingComparator();
    IncludeBreakfastComparator breakfastComparator = new IncludeBreakfastComparator();
    PriceComparator priceComparator = new PriceComparator();
    ABCOrderComparator abcOrderComparator = new ABCOrderComparator();

    public void sortHotelsByTopRatingWithBreakfast(List<Hotel> hotelList) {
        Collections.sort(hotelList, breakfastComparator.thenComparing(ratingComparator));
    }

    public void sortHotelsByPrice(List<Hotel> hotelList) {
        Collections.sort(hotelList, priceComparator);

    }

    public void sortHotelsByAlphabetOrder(List<Hotel> hotelList) {
        Collections.sort(hotelList, abcOrderComparator);

    }
}
