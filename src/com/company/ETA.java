package com.company;

import java.util.Calendar;

public class ETA {
    public static Calendar eTA (double distance, Calendar departureTime) {
        Calendar arrival = departureTime;
        System.out.println(distance);
        int minutes = (int) Math.round(distance)/5 + 10;
        arrival.add(Calendar.MINUTE, minutes);
        System.out.println(minutes);
        return arrival;
    }
}