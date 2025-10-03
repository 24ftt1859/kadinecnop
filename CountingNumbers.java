// CountingNumbers.java
import java.util.Scanner;
import java.text.DecimalFormat;

public class CountingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer, the input ends if it is 0:");

        int positives = 0;
        int negatives = 0;
        int total = 0;
        int countNonZero = 0;

        while (true) {
            // read next integer; if no integer, skip token
            if (!sc.hasNextInt()) {
                sc.next();
                continue;
            }
            int n = sc.nextInt();
            if (n == 0) break;

            if (n > 0) positives++;
            else negatives++;

            total += n;
            countNonZero++;
        }

        if (countNonZero == 0) {
            System.out.println("\nNo number is entered except for 0 to end the program.");
        } else {
            double average = (double) total / countNonZero;
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println("\nThe number of positive is " + positives);
            System.out.println("\nThe number of negatives is " + negatives);
            System.out.println("\nThe total is " + total);
            System.out.println("\nThe average is " + df.format(average));
        }

        sc.close();
    }
}
