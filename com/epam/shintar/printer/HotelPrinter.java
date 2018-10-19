package com.epam.shintar.printer;

import com.epam.shintar.entity.Hotel;

import java.util.List;

public class HotelPrinter {

    public void printFilteredHotels(List<Hotel> hotelList) {
        for (Hotel hotel : hotelList) {
            System.out.println("\t" + hotel);
        }
    }
}

