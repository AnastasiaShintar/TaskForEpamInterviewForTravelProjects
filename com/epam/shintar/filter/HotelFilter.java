package com.epam.shintar.filter;

import com.epam.shintar.entity.Hotel;
import com.epam.shintar.entity.enumPackage.PlaceType;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HotelFilter {

    public List<Hotel> filterFirstFive(List<Hotel> hotelList) {
        List<Hotel> filteredFirstFiveHotelList = new ArrayList<>();
        Iterator<Hotel> iterator = hotelList.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            if (count < 5) {
                filteredFirstFiveHotelList.add(iterator.next());
                count++;
            }else {
                break;
            }
        }
        return filteredFirstFiveHotelList;
    }

    public List<Hotel> filterWithBreakfastOnly(List<Hotel> hotelList) {
        List<Hotel> filteredHotelsWithBreakfastOnlyList = new ArrayList<>();
        for (int i = 0; i < hotelList.size(); i++) {
            if (hotelList.get(i).getBreakfast() == true) {
                filteredHotelsWithBreakfastOnlyList.add(hotelList.get(i));
            }
        }
        return filteredHotelsWithBreakfastOnlyList;
    }

    public List<Hotel> filterHotelOnly(List<Hotel> hotelList) {
        System.out.println("Hotel:");
        List<Hotel> filteredHotelList = new ArrayList<>();
        for (int i = 0; i < hotelList.size(); i++) {
            if (hotelList.get(i).getType() == PlaceType.HOTEL) {
                filteredHotelList.add(hotelList.get(i));
            }
        }
        return filteredHotelList;
    }

    public List<Hotel> filterHostelOnly(List<Hotel> hotelList) {
        System.out.println("Hostel:");
        List<Hotel> filteredHostelList = new ArrayList<>();
        for (int i = 0; i < hotelList.size(); i++) {
            if (hotelList.get(i).getType() == PlaceType.HOSTEL) {
                filteredHostelList.add(hotelList.get(i));
            }
        }
        return filteredHostelList;
    }

    public List<Hotel> filterApartmentOnly(List<Hotel> hotelList) {
        System.out.println("Apartment:");
        List<Hotel> filteredApartmentList = new ArrayList<>();
        for (int i = 0; i < hotelList.size(); i++) {
            if (hotelList.get(i).getType() == PlaceType.APARTMENT) {
                filteredApartmentList.add(hotelList.get(i));
            }
        }
        return filteredApartmentList;
    }

    public List<Hotel> filterHotelsByPriceRange(List<Hotel> hotelList, double start, double end) {
        System.out.println((int) start + "-" + end + " $");
        List<Hotel> filteredByPriceRangeList = new ArrayList<>();
        for (int i = 0; i < hotelList.size(); i++) {
            if (hotelList.get(i).getPrice() >= start && hotelList.get(i).getPrice() <= end) {
                filteredByPriceRangeList.add(hotelList.get(i));
            }
        }
        return filteredByPriceRangeList;
    }

    public List<Hotel> filterHotelsByPriceRange(List<Hotel> hotelList, double start) {
        System.out.println((int) start + "+ $");
        List<Hotel> filteredByPriceRangeList = new ArrayList<>();
        for (int i = 0; i < hotelList.size(); i++) {
            if (hotelList.get(i).getPrice() >= start) {
                filteredByPriceRangeList.add(hotelList.get(i));
            }
        }
        return filteredByPriceRangeList;
    }
}
