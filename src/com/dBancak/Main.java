package com.dBancak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        Party party = new Party();

        // DISPLAY MENU
        while(isRunning) {
            System.out.println("Wybierz opcję");
            System.out.println("[1] Wyświetl gości");
            System.out.println("[2] Dodaj gościa");
            System.out.println("[3] Wyświetl potrawy");
            System.out.println("[4] Znajdź po numerze telefonu");
            System.out.println("[5] Wyjście");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> party.displayGuests();
                case 2 -> party.addNewGuest();
                case 3 -> party.displayMeals();
                case 4 -> party.displayGuestByPhoneNumber();
                case 5 -> isRunning = false;
            }
        }
    }
}
