package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        user_input();
    }

    private static void user_input(){


        // ---------Made by CONSTRUCTOR---------
        System.out.println("---------Made by CONSTRUCTOR---------");
        Person person = new Person("Jake", "British", "5th of Feb, 1987", 34);
        System.out.println(person);


        System.out.println("\n");


        // ---------Made by GETTERS-&-SETTERS---------
        System.out.println("---------Made by GETTERS-&-SETTERS---------");
        Guest guest = new Guest();
        guest.setGuest("David");
        guest.setNational("American");
        guest.setBirth_date("22th of Aug, 1990");
        guest.setHow_old(31);
        System.out.println(guest);


        System.out.println("\n");


        // ---------Asking user to SET-&-GET---------
        System.out.println("---------Asking user to SET-&-GET---------");

            Guest guest_2 = new Guest();
            Scanner input = new Scanner(System.in);
            System.out.print("What's your name? ");
            guest_2.setGuest(input.nextLine());

            System.out.print("What's your nationality? ");
            guest_2.setNational(input.nextLine());

            System.out.print("What is your birth date? ");
            guest_2.setBirth_date(input.nextLine());

            System.out.print("How old are you now? ");
            guest_2.setHow_old(input.nextInt());

            System.out.println("\n" + guest_2);
    }




}
