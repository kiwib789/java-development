
import java.util.Scanner;
public class fullNameParser {

        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);

            // first last name
            getName(scanner, "first and last name: ");

            //first middle and last name
            getName(scanner, "first, middle, and last name: ");

            scanner.close();

        }
        public static void getName(Scanner scanner, String format) {
            System.out.print("\n Enter " + format );
            String input = scanner.nextLine().trim();
            String[] parts = input.split(" ");

            // if statements
            if ((format.equals("Enter first and last name: ") && parts.length == 2) ||
                    (format.equals("Enter first, middle, and last name: ") && parts.length >= 2)) {
                System.out.println("First name: " + parts[0]);

                if (parts.length == 2) {
                    System.out.println("Last name: " + parts[1]);
                    System.out.println("Middle name: ");

                } else {
                    System.out.println("Last name: " + parts[1]);
                    System.out.println("Middle name: ");
                }

            }
        }
        }
