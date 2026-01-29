import java.util.Scanner;
import java.util.Random;

public class Numberguess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int target = rand.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("🎲 Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100:");

        while (true) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < 1 || guess > 100) {
                System.out.println("❌ Please guess between 1 and 100 only!");
                continue;
            }

            if (guess < target) {
                System.out.println("🔼 Too low! Try again.");
            } else if (guess > target) {
                System.out.println("🔽 Too high! Try again.");
            } else {
                System.out.println("🎉 Correct! You guessed it in " + attempts + " attempts.");
                break;
            }
        }
    }
}
