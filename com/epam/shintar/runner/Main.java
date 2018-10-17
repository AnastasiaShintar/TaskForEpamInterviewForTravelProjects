package com.epam.shintar.runner;

import com.epam.shintar.entity.Hotel;
import com.epam.shintar.printer.HotelPrinter;
import com.epam.shintar.warehouse.HotelList;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        HotelPrinter hotelPrinter = new HotelPrinter();
        HotelList hotelList = new HotelList();

        List<Hotel> filledList = hotelList.createHotelList();

        hotelPrinter.printTopFiveHotelsSortedByTopRatingWithBreakfast(filledList);

        hotelPrinter.printHotelsGroupedByTypeAndSortedByPrice(filledList);

        hotelPrinter.printHotelsInPriceRangeAndSortedByAlphabetOrder(filledList, 0, 39.99);
        hotelPrinter.printHotelsInPriceRangeAndSortedByAlphabetOrder(filledList, 40, 79.99);
        hotelPrinter.printHotelsInPriceRangeAndSortedByAlphabetOrder(filledList, 80);
    }
}
