package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MakeBPFile {
    public static void file () throws IOException {
        File bP = new File("BoardingPass.txt");
        FileWriter bPWriter = new FileWriter("BoardingPass.txt");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name.");
        String name = input.nextLine();
        System.out.println("Please enter your email.");
        String email = input.nextLine();
        System.out.println("Please enter your phone number.");
        String phone = input.nextLine();
        System.out.println("Please enter your gender. \"M\", \"F\", or \"other\"");
        String gender = input.nextLine();
        System.out.println("Please enter your age.");
        int age = input.nextInt();
        System.out.println("Please enter the year you wish to depart (e.g. 2022).");
        int year = input.nextInt();
        System.out.println("Please enter the month you wish to depart (e.g. 1 is January, 11 is November).");
        int month = input.nextInt();
        System.out.println("Please enter the day you wish to depart (e.g. 1, 28).");
        int day = input.nextInt();
        System.out.println("Please enter the hour you wish to depart (e.g. 1, 23).");
        int hour = input.nextInt();
        System.out.println("Please enter the origin state in 2 letter abbreviation (e.g. NY for New York).");
        String origin = input.next();
        System.out.println("Please enter the destination state in 2 letter abbreviation (e.g. NY for New York).");
        String destination = input.next();

        Calendar departure = Calendar.getInstance();
        departure.set(Calendar.DATE, day);
        departure.set(Calendar.HOUR_OF_DAY, hour);
        departure.set(Calendar.MONTH, month-1);
        departure.set(Calendar.YEAR, year);
        Date start = departure.getTime();

        Locations calcLocation = new Locations();
        Double distance = calcLocation.location(origin, destination);
        ETA calcEta = new ETA();
        Calendar arrival = calcEta.eTA(distance, departure);
        FinalPrice calcPrice = new FinalPrice();
        double price = calcPrice.price(distance, age, gender);
        BoardingPassNumber bPNGen = new BoardingPassNumber();
        String bPN = bPNGen.bPN(name, day, month, year, distance);


        bPWriter.write("\nName: " + name + "                   Email: " + email + "                  Phone Number: " + phone);
        bPWriter.write("\nGender: " + gender + "                          Age: " + age + "                       Boarding Pass #: " + bPN);
        bPWriter.write("\nState of departure: " + origin + "                                      Destination: " + destination);
        bPWriter.write("\nDeparture time: " + start + "               Estimated time of arrival: " + arrival.getTime());
        bPWriter.write("\nTotal Ticket Price: $" + price + "0");
        bPWriter.close();
    }
}
