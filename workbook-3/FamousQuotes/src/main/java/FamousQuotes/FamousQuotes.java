package FamousQuotes;
import java.util.Arrays;
import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        String[] quotes = {
                "I'm not interested in money. I just want to be wonderful.",
                "Success is not final, failure is not fatal: It is the courage to continue that counts.",
                "The best way to find out what you want in life is to try a lot of things.",
                "Don't let anyone tell you what you can't do. Follow your dreams and persist.",
                "Life is what we make it and how we make it – whether we realize it or not.",
                "The only limit to our realization of tomorrow will be our doubts of today.",
                "The only way to do great work is to love what you do.",
                "I can accept failure, everyone fails at something. But I can't accept not trying.",
                "The greatest glory in living lies not in never falling, but in rising every time we fall.",
                "If you want to make your dreams come true, the first thing you have to do is wake up."
        };

        // scanner for users input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a number between 1 and 10 to see a famous quote:");

        try {
            // users input
            int chosen = scanner.nextInt();

            if (chosen >= 1 && chosen <= 10) {
                System.out.println("Quote " + chosen + ": " + quotes[chosen - 1]);

            } else {
                System.out.println("Invalid, choose number between 1 and 10.");
            }

        } catch (Exception e) {
            System.out.println("Invalid, please enter valid number.");

        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}

