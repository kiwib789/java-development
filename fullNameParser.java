
import java.util.Scanner;
public class fullNameParser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first and last name: ");
        String firstLastName = scanner.nextLine();

        String[] nameParts = firstLastName.split(" ");

        if (nameParts.length == 2) {
            // First and last name only
            String firstName = nameParts[0];
            String lastName = nameParts[1];
            System.out.print("Enter your first middle and last name: ");
            String fullName = scanner.nextLine();
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);

        }
        if (nameParts.length == 3) {

            // First, middle, and last name
            String firstName = nameParts[0];
            String middleName = nameParts[1];
            String lastName = nameParts[2];
            System.out.print("Enter your first middle and last name: ");
            String fullName = scanner.nextLine();
            String[] nameFullParts = fullName.split(" ");
            System.out.println("First Name: " + firstName);
            System.out.println("Middle Name: " + middleName);
            System.out.println("Last Name: " + lastName);


        }
    }
}
