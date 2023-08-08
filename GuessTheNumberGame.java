import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound);

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < secretNumber) {
                System.out.println("Try a higher number.");
            } else if (userGuess > secretNumber) {
                System.out.println("Try a lower number.");
            } else {
                System.out.println("Congratulations! You guessed the number " + secretNumber + " in " + attempts + " attempts.");
                hasGuessedCorrectly = true;
            }
        }

        scanner.close();
    }
}
