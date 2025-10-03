// FibonacciNumber.java
import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the term : ");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print("Please enter the term : ");
        }
        int term = sc.nextInt();

        if (term < 0) {
            System.out.println("Term must be non-negative.");
            sc.close();
            return;
        }

        // F0 = 0, F1 = 1
        if (term == 0) {
            System.out.printf("At term %d the number is %d%n", term, 0);
            sc.close();
            return;
        } else if (term == 1) {
            System.out.printf("At term %d the number is %d%n", term, 1);
            sc.close();
            return;
        }

        int f0 = 0;
        int f1 = 1;
        int fn = 0;

        for (int i = 2; i <= term; i++) {
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }

        System.out.printf("At term %d the number is %d%n", term, fn);
        sc.close();
    }
}
