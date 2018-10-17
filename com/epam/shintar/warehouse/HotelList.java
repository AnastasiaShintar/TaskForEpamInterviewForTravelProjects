package com.epam.shintar.warehouse;

import com.epam.shintar.entity.Hotel;
import com.epam.shintar.enumPackage.BreakfastProvision;
import com.epam.shintar.enumPackage.PlaceType;

import java.util.ArrayList;
import java.util.List;

public class HotelList {

    List<Hotel> hotelList = new ArrayList<>();

    public List<Hotel> createHotelList() {
        hotelList.add(new Hotel("Apartament San Siro", PlaceType.APARTMENT, 95.00, 8.1, BreakfastProvision.BREAKFAST_NOT_INCLUDED));
        hotelList.add(new Hotel("Aparthotel Duomo", PlaceType.APARTMENT, 50.50, 9.7, BreakfastProvision.BREAKFAST_NOT_INCLUDED));
        hotelList.add(new Hotel("Apartment Amelie", PlaceType.APARTMENT, 47.00, 6.3, BreakfastProvision.BREAKFAST_INCLUDED));
        hotelList.add(new Hotel("Brera Apartments", PlaceType.APARTMENT, 47.35, 6.4, BreakfastProvision.BREAKFAST_NOT_INCLUDED));
        hotelList.add(new Hotel("Crowne Plaza Rome", PlaceType.HOTEL, 118.30, 7.9, BreakfastProvision.BREAKFAST_INCLUDED));
        hotelList.add(new Hotel("Hilton", PlaceType.HOTEL, 75.99, 9.3, BreakfastProvision.BREAKFAST_INCLUDED));
        hotelList.add(new Hotel("Hostel Colours", PlaceType.HOSTEL, 45.00, 6.9, BreakfastProvision.BREAKFAST_INCLUDED));
        hotelList.add(new Hotel("Hostel Urban Navigli", PlaceType.HOSTEL, 27.00, 7.2, BreakfastProvision.BREAKFAST_NOT_INCLUDED));
        hotelList.add(new Hotel("Hotel Cosmopolita", PlaceType.HOTEL, 90.00, 8.0, BreakfastProvision.BREAKFAST_NOT_INCLUDED));
        hotelList.add(new Hotel("Hotel Jonico", PlaceType.HOTEL, 85.07, 8.4, BreakfastProvision.BREAKFAST_INCLUDED));
        hotelList.add(new Hotel("Monte Napoleone Apartment", PlaceType.APARTMENT, 57.99, 8.4, BreakfastProvision.BREAKFAST_NOT_INCLUDED));
        hotelList.add(new Hotel("Ostello Bello", PlaceType.HOSTEL, 25.99, 8.3, BreakfastProvision.BREAKFAST_NOT_INCLUDED));
        hotelList.add(new Hotel("Sofitel Rome Villa Borghese", PlaceType.HOTEL, 85.34, 5.9, BreakfastProvision.BREAKFAST_INCLUDED));
        hotelList.add(new Hotel("The Loft Apartment - Milan", PlaceType.APARTMENT, 55.60, 6.3, BreakfastProvision.BREAKFAST_NOT_INCLUDED));
        hotelList.add(new Hotel("Un posto a Milano", PlaceType.HOSTEL, 35.65, 7.6, BreakfastProvision.BREAKFAST_NOT_INCLUDED));
        hotelList.add(new Hotel("Venezia Apartment", PlaceType.APARTMENT, 45.00, 9.5, BreakfastProvision.BREAKFAST_NOT_INCLUDED));
        return hotelList;
    }

    public void getHotel(List<Hotel> hotelList) {
        System.out.println("Hotel:");
        for (int i = 0; i < hotelList.size(); i++) {
            if (hotelList.get(i).getType() == PlaceType.HOTEL) {
                System.out.println("\t" + hotelList.get(i));
            }
        }
    }

    public void getHostel(List<Hotel> hotelList) {
        System.out.println("Hostel:");
        for (int i = 0; i < hotelList.size(); i++) {
            if (hotelList.get(i).getType() == PlaceType.HOSTEL) {
                System.out.println("\t" + hotelList.get(i));
            }
        }
    }

    public void getApartment(List<Hotel> hotelList) {
        System.out.println("Apartment:");
        for (int i = 0; i < hotelList.size(); i++) {
            if (hotelList.get(i).getType() == PlaceType.APARTMENT) {
                System.out.println("\t" + hotelList.get(i));
            }
        }
    }

    public void getPriceRange(List<Hotel> hotelList, double start, double end) {
        System.out.println((int) start + "-" + end + " $");

        for (int i = 0; i < hotelList.size(); i++) {
            if (hotelList.get(i).getPrice() >= start && hotelList.get(i).getPrice() <= end) {
                System.out.println("\t" + hotelList.get(i));
            }
        }
    }

    public void getPriceRange(List<Hotel> hotelList, double start) {
        System.out.println((int) start + "+ $");
        for (int i = 0; i < hotelList.size(); i++) {
            if (hotelList.get(i).getPrice() >= start) {
                System.out.println("\t" + hotelList.get(i));
            }
        }
    }
}
