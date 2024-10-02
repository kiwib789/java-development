package futureCalculator.java;

import java.util.Scanner;

public class futureCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Investment amount:");
        double principal = scanner.nextDouble();

        System.out.println("Annual interest rate:");
        double interestRate = scanner.nextDouble() / 100;

        System.out.println("Number of years:");
        int years = scanner.nextInt();

        double futureValue = calculateFuture( principal,interestRate,years);
        double totalInterest = futureValue - principal;

        System.out.printf("Future value of investment: %.2f\n", futureValue);
        System.out.printf("Total interest earned: %.2f\n", totalInterest);
        scanner.close();
    }
public static double calculateFuture(double principal, double annualInterestRate, int years){
        return principal * Math.pow(1 + annualInterestRate,years);
}


}
