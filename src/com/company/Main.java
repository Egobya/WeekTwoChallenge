package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        // write your code here
        Scanner Keyboard = new Scanner(System.in);
        ArrayList<String> RoboResume = new ArrayList<String>();
        int size = 10;
        int counter = 0;
        boolean quit = false;
        String name[] = new String[size];
        String email_address[] = new String[size];
        String educational_achievement[] = new String[size];
        String experiences[] = new String[size];
        String duties[] = new String[20];
        String skills_with_rating[] = new String[size];
        String recordAgain = "";



        while (quit == false) {
            System.out.println("enter a name:");
            name[counter] = Keyboard.nextLine();
            System.out.println("enter email_address:");
            email_address[counter] = Keyboard.nextLine();
            System.out.println("enter educational_achievement:");
            educational_achievement[counter] = Keyboard.nextLine();
            System.out.println("enter experiences");
            experiences[counter] = Keyboard.nextLine();
            System.out.println("enter skills_with_rating:");
            skills_with_rating[counter] = Keyboard.nextLine();

            // System.out.println("Do you want to enter another record? (Y/N):");
            recordAgain = Keyboard.next();


            System.out.println("======================================================");

            System.out.println("a name:" + name[counter]);
            System.out.println("");
            System.out.println("education:" + educational_achievement[counter]);
            System.out.println("");
            System.out.println("experiences:" + experiences[counter]);
            System.out.println("");
            System.out.println("skills_with_rating:" + skills_with_rating[counter]);
            System.out.println("");


            System.out.println("Do you want to enter another record?(Y/N)");
            Keyboard = new Scanner(System.in);
            recordAgain = Keyboard.nextLine();
            if (recordAgain.equalsIgnoreCase("N")) {
                quit = true;
            } else {
                counter++;

            }

        }


    }

}