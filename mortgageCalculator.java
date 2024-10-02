import java.util.Scanner;

public class mortgageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // user input
        System.out.print("Enter the loan amount (principal): ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the annual interest rate (in percentage): ");
        double interestRate = scanner.nextDouble();
        System.out.print("Enter the loan term (in years): ");
        int years = scanner.nextInt();

        // monthly payment
        double monthlyPayment = calculateMonthlyPayment(principal, interestRate, years);

        // total payment and total interest
        double totalPayment = monthlyPayment * years * 12;
        double totalInterest = totalPayment - principal;

        System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
        System.out.printf("Total Payment: %.2f\n", totalPayment);
        System.out.printf("Total Interest: %.2f\n", totalInterest);

        scanner.close();
    }

    public static double calculateMonthlyPayment(double principal, double interestRate, int years) {
        double monthlyInterestRate = interestRate / 100 / 12;
        int numberOfPayments = years * 12;

        return (principal * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
    }
}

