// RockPaperScissorLoop.java
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int rounds = 0;
        int userScore = 0;
        int compScore = 0;

        String cont;
        do {
            System.out.print("Enter rock (0), paper (1), scissor (2): ");
            int userChoice;
            // validate integer input
            while (!sc.hasNextInt()) {
                sc.next(); // discard
                System.out.print("Enter rock (0), paper (1), scissor (2): ");
            }
            userChoice = sc.nextInt();
            while (userChoice < 0 || userChoice > 2) {
                System.out.print("Invalid choice. Enter rock (0), paper (1), scissor (2): ");
                while (!sc.hasNextInt()) {
                    sc.next();
                    System.out.print("Enter rock (0), paper (1), scissor (2): ");
                }
                userChoice = sc.nextInt();
            }

            int compChoice = rand.nextInt(3);
            String[] names = {"rock", "paper", "scissor"};
            System.out.printf("The computer is %s. You are %s. ", names[compChoice], names[userChoice]);

            // Determine outcome
            if (userChoice == compChoice) {
                System.out.println("It is a draw.");
            } else if ((userChoice == 0 && compChoice == 2) ||
                       (userChoice == 1 && compChoice == 0) ||
                       (userChoice == 2 && compChoice == 1)) {
                System.out.println("You win.");
                userScore++;
            } else {
                System.out.println("You lose.");
                compScore++;
            }

            rounds++;

            System.out.print("\nEnter y to play again: ");
            cont = sc.next().trim();
            System.out.println();
        } while (cont.equalsIgnoreCase("y"));

        System.out.printf("In the total of %d round(s), You scored %d, Computer scored %d%n", rounds, userScore, compScore);

        if (userScore > compScore) {
            System.out.println("You won the game.");
        } else if (userScore < compScore) {
            System.out.println("You lose the game.");
        } else {
            System.out.println("It is a draw game.");
        }

        sc.close();
    }
}
