import java.util.Scanner;
import java.util.Random;

public class IsPalindromeReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(900) + 100;  // random 100–999
        System.out.print("Enter the reverse of " + number + ": ");
        int userInput = sc.nextInt();

        // Check if input is 3 digits
        while (userInput < 100 || userInput > 999) {
            System.out.print("Please enter a 3-digit reverse number of " + number + ": ");
            userInput = sc.nextInt();
        }

        int reversed = reverse(number);
        boolean isPal = isPalindrome(userInput, reversed);

        System.out.println("The digit " + userInput + " is palindrome of " + number + " is " + isPal + ".");
    }

    // Method to reverse the digits of a number
    public static int reverse(int number) {
        int rev = 0;
        while (number != 0) {
            rev = rev * 10 + number % 10;
            number /= 10;
        }
        return rev;
    }

    // Method to check if both numbers are palindrome of each other
    public static boolean isPalindrome(int user, int reversedNumber) {
        return user == reversedNumber;
    }
}
