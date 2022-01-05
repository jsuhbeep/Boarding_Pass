package com.company;

public class BoardingPassNumber {
    public static String bPN (String name, int date, int month, int year, Double distance) {
        try {
            return "" + name + "" + date + "" + month + "" + year + "" + Math.round(distance);
        } catch (Exception e) {
            System.out.println("Error generating boarding pass number.");
        }
        return name + date + Math.round(distance);
    }
}