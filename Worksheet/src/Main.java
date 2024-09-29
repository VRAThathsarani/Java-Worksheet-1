import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        String word;
        System.out.println("Enter the odd length word: ");
        word = scanner.nextLine();
        int length = word.length();

        if (length%2 == 1) {
            int middleIndex = length / 2;

            System.out.println("The middle character is:" + word.charAt(middleIndex));
        }

        else {
            System.out.println("The word you entered does not have an odd length");
        }

    }
}


