package com.pluralsight;

import java.util.Scanner;

public class TheaterReservations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine();

        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String date = scanner.nextLine();

        System.out.print("How many tickets would you like? ");
        int tickets = scanner.nextInt();

        String[] parts = fullName.split(" ");
        String firstName = parts[0];
        String lastName = parts[1];

        if (tickets == 1) {
            System.out.println("1 ticket reserved for " + date +
                    " under " + lastName + ", " + firstName);
        } else {
            System.out.println(tickets + " tickets reserved for " + date +
                    " under " + lastName + ", " + firstName);
        }

        scanner.close();
    }
}