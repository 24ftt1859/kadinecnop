import java.util.Scanner;

public class NumberOfDurians {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double price = 15.75;
        System.out.println("Each durian cost $" + price);

        System.out.print("How much money do you have? $");
        double money = input.nextDouble();

        int number = (int)(money / price);

        System.out.println("The number of durian(s) you can buy is " + number);
    }
}
