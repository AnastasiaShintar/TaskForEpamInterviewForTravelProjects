package com.epam.shintar.runner;

import com.epam.shintar.entity.Hotel;
import com.epam.shintar.filter.HotelFilter;
import com.epam.shintar.printer.HotelPrinter;
import com.epam.shintar.sorter.HotelSorter;
import com.epam.shintar.warehouse.HotelList;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        HotelList hotelList = new HotelList();
        HotelPrinter hotelPrinter = new HotelPrinter();
        HotelFilter hotelFilter = new HotelFilter();
        HotelSorter hotelSorter = new HotelSorter();

        List<Hotel> filledList = hotelList.createHotelList();


        //task 1
        hotelPrinter.printFilteredHotels(hotelFilter.filterFirstFive(hotelSorter.sortHotelsByTopRating(hotelFilter.filterWithBreakfastOnly(filledList))));

        //task2
        hotelPrinter.printFilteredHotels(hotelFilter.filterHotelOnly(hotelSorter.sortHotelsByPrice(filledList)));
        hotelPrinter.printFilteredHotels(hotelFilter.filterHostelOnly(hotelSorter.sortHotelsByPrice(filledList)));
        hotelPrinter.printFilteredHotels(hotelFilter.filterApartmentOnly(hotelSorter.sortHotelsByPrice(filledList)));

        //task3
        hotelPrinter.printFilteredHotels(hotelFilter.filterHotelsByPriceRange(hotelSorter.sortHotelsByAlphabetOrder(filledList), 0, 39.99));
        hotelPrinter.printFilteredHotels(hotelFilter.filterHotelsByPriceRange(hotelSorter.sortHotelsByAlphabetOrder(filledList), 40, 79.99));
        hotelPrinter.printFilteredHotels(hotelFilter.filterHotelsByPriceRange(hotelSorter.sortHotelsByAlphabetOrder(filledList), 80));

    }
}
