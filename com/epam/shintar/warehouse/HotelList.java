package com.epam.shintar.warehouse;

import com.epam.shintar.entity.Hotel;
import com.epam.shintar.entity.enumPackage.*;

import java.util.ArrayList;
import java.util.List;

public class HotelList {

    List<Hotel> hotelList = new ArrayList<>();

    public List<Hotel> createHotelList() {
        hotelList.add(new Hotel("Apartament San Siro", PlaceType.APARTMENT, 95.00, 8.1, true));
        hotelList.add(new Hotel("Aparthotel Duomo", PlaceType.APARTMENT, 50.50, 9.7, true));
        hotelList.add(new Hotel("Apartment Amelie", PlaceType.APARTMENT, 47.00, 6.3, false));
        hotelList.add(new Hotel("Brera Apartments", PlaceType.APARTMENT, 47.35, 6.4, false));
        hotelList.add(new Hotel("Crowne Plaza Rome", PlaceType.HOTEL, 118.30, 7.9, false));
        hotelList.add(new Hotel("Hilton", PlaceType.HOTEL, 75.99, 9.3, false));
        hotelList.add(new Hotel("Hostel Colours", PlaceType.HOSTEL, 45.00, 6.9, false));
        hotelList.add(new Hotel("Hostel Urban Navigli", PlaceType.HOSTEL, 27.00, 7.2, false));
        hotelList.add(new Hotel("Hotel Cosmopolita", PlaceType.HOTEL, 90.00, 8.0, false));
        hotelList.add(new Hotel("Hotel Jonico", PlaceType.HOTEL, 85.07, 8.4, false));
        hotelList.add(new Hotel("Monte Napoleone Apartment", PlaceType.APARTMENT, 57.99, 8.4, false));
        hotelList.add(new Hotel("Ostello Bello", PlaceType.HOSTEL, 25.99, 8.3, false));
        hotelList.add(new Hotel("Sofitel Rome Villa Borghese", PlaceType.HOTEL, 85.34, 5.9, false));
        hotelList.add(new Hotel("The Loft Apartment - Milan", PlaceType.APARTMENT, 55.60, 6.3, false));
        hotelList.add(new Hotel("Un posto a Milano", PlaceType.HOSTEL, 35.65, 7.6, false));
        hotelList.add(new Hotel("Venezia Apartment", PlaceType.APARTMENT, 45.00, 9.5, false));
        return hotelList;
    }
}
