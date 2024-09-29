import java.util.*;

public class Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value in Centimeters: ");
        double centimeter = scanner.nextDouble();

        double inches = centimeter / (2.54);

        int feet = (int)inches / (12);

        double mod = inches % (12);

        System.out.println(feet + " feet" + " and " + String.format("%.2f", mod) + " inches.");
    }
}
