package se.lexicon;

import java.util.Scanner;

public class AnnasLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year number (YYYY)");
        int year = scanner.nextInt();
        // check if year is a leapyear print leapyear value
        if (year % 4 == 0) {
            System.out.println("LeapYear");
        } else {
            System.out.println("Not LeapYear");
        }


    }
}
