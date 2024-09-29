import java.util.*;

public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter the middle name: ");
        String middleName = scanner.nextLine();

        System.out.println("Enter the last name: ");
        String lastName = scanner.nextLine();



        System.out.println(lastName + ", " + firstName + " " +  middleName.charAt(0) + ".");
    }
}
