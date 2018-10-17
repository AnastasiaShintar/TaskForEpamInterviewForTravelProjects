package com.epam.shintar.printer;

import com.epam.shintar.entity.Hotel;
import com.epam.shintar.sorter.HotelSorter;
import com.epam.shintar.warehouse.HotelList;

import java.util.List;

public class HotelPrinter {

    HotelSorter hotelSorter = new HotelSorter();
    HotelList list = new HotelList();

    public void printTopFiveHotelsSortedByTopRatingWithBreakfast(List<Hotel> hotelList) {
        hotelSorter.sortHotelsByTopRatingWithBreakfast(hotelList);
        for (int i = 0; i < 5; i++) {
            System.out.println(hotelList.get(i));
        }
    }

    public void printHotelsGroupedByTypeAndSortedByPrice(List<Hotel> hotelList) {
        hotelSorter.sortHotelsByPrice(hotelList);
        list.getHotel(hotelList);
        list.getHostel(hotelList);
        list.getApartment(hotelList);
    }

    public void printHotelsInPriceRangeAndSortedByAlphabetOrder(List<Hotel> hotelList, double fromRange, double toRange) {
        hotelSorter.sortHotelsByAlphabetOrder(hotelList);
        list.getPriceRange(hotelList, fromRange, toRange);
    }

    public void printHotelsInPriceRangeAndSortedByAlphabetOrder(List<Hotel> hotelList, double fromRange) {
        hotelSorter.sortHotelsByAlphabetOrder(hotelList);
        list.getPriceRange(hotelList, fromRange);
    }

}
