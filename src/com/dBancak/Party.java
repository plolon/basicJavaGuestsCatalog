package com.dBancak;

import java.util.*;

public class Party {
    private List<Guest> guests = new ArrayList<>();
    private Set<String> meals = new HashSet<>();
    private Map<Integer, Guest> phoneToGuest = new HashMap<>();

    Scanner scanner = new Scanner(System.in);


    public void addNewGuest()
    {
        System.out.println("Podaj imię gościa");
        String name = scanner.nextLine();
        System.out.println("Podaj preferowany posiłek");
        String meal = scanner.nextLine();
        System.out.println("Podaj numer telefonu");
        int phone = Integer.valueOf(scanner.nextLine());
        System.out.println("Czy weganin? (Y/N)");
        String isVeganString = scanner.nextLine();
        boolean isVegan;

        if (isVeganString.equals("Y")) {
            isVegan=true;
        }
        else {
            isVegan=false;
        }
        Guest guest = new Guest(name, meal, phone, isVegan);

        meals.add(meal);
        phoneToGuest.put(phone, guest);
        guests.add(guest);
    }

    public void displayMeals() {
        for (String meal : meals) {
            System.out.println(meal);
        }
    }

    public void displayGuestByPhoneNumber() {
        System.out.println("Podaj numer telefonu");
        Integer phone = Integer.valueOf(scanner.nextLine());
        Guest guest = phoneToGuest.get(phone);

        guest.displayGuestInformation();
    }

    public void displayGuests()
    {
        int tmp = 1;
        for (Guest guest : guests){
            System.out.println("Gość numer " + tmp);
            guest.displayGuestInformation();
            System.out.println("");
            tmp++;
        }
    }

}
