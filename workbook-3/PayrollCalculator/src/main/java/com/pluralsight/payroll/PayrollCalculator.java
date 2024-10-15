package com.pluralsight.payroll;

import java.util.Scanner;

public class PayrollCalculator {
    private  String employeeID;
    private String name;
    private double hoursWorked;
    private double payRate;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Payroll calculator");

        //employee ID
        System.out.println("Enter employee ID");
        String employeeID = scanner.nextLine();

        // employee name
        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        // amount of hours employee worked
        System.out.println("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();

        // employees pay rate
        System.out.println("Enter pay rate: ");
        double payRate = scanner.nextDouble();

        // total pay
        double grossPay = payRate * hoursWorked;
        System.out.println("Gross pay: $");


    }


}
