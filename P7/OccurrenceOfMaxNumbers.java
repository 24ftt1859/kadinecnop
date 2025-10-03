// OccurrenceOfMaxNumbers.java
import java.util.Scanner;

public class OccurrenceOfMaxNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers, the input ends with 0 entered:");

        int largest = Integer.MIN_VALUE;
        int count = 0;
        boolean anyNumber = false;

        while (true) {
            if (!sc.hasNextInt()) {
                sc.next();
                continue;
            }
            int num = sc.nextInt();
            if (num == 0) break;

            anyNumber = true;
            if (num > largest) {
                largest = num;
                count = 1;
            } else if (num == largest) {
                count++;
            }
        }

        if (!anyNumber) {
            System.out.println("\nNo number is entered except for 0 to end the program.");
        } else {
            System.out.println("\nThe largest number is " + largest);
            System.out.println("The occurrence count of the largest number is " + count);
        }

        sc.close();
    }
}
