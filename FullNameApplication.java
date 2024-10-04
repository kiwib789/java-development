package com.pluralsight;


import java.util.Scanner;
public class  FullNameApplication{

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //user enters first name
    System.out.print("First name: ");
    String firstName = scanner.nextLine().trim();


    // user enters middle name
    System.out.print("Middle name: ");
    String middleName = scanner.nextLine();


    // user enters last name
    System.out.print("Last name: ");
    String lastName = scanner.nextLine().trim();


    // user enters suffix
    System.out.print("Suffix: ");
    String suffix = scanner.nextLine().trim();

    // users full name
    String fullName = firstName;


    // if statements for middle and suffix


        if (!middleName.isEmpty()) {
            fullName += " " + middleName;
        }
           // add last name
    fullName+= " " + lastName;

            if (!suffix.isEmpty()) {
                fullName += ", " + suffix;
            }

            // print full name
            System.out.println("Full name: " + fullName);

            scanner.close();
        }
    }



