package internship;

import java.util.Random;
import java.util.Scanner;

public class Codsoftproject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create a random object for generating random numbers
        Random random = new Random();

        // Initialize the variables for the game
        int range = 100; // The range of the numbers to be guessed
        int maxAttempts = 10; // The maximum number of attempts allowed
        int rounds = 3; // The number of rounds to play
        int score = 0; // The score of the user

        // Print a welcome message
        System.out.println("Welcome to the number guessing game!");
        System.out.println("You have to guess a number between 1 and " + range + " in " + maxAttempts + " attempts.");
        System.out.println("You will play " + rounds + " rounds. Your score will be based on the number of attempts taken.");
        System.out.println("Let's begin!");

        // Loop for each round
        for (int round = 1; round <= rounds; round++) {
            // Generate a random number within the range
            int number = random.nextInt(range) + 1;

            // Initialize the number of attempts taken
            int attempts = 0;

            // Print the round number
            System.out.println("\nRound " + round + ":");

            // Loop until the user guesses the correct number or runs out of attempts
            while (true) {
                // Prompt the user to enter their guess
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();

                // Increment the number of attempts taken
                attempts++;

                // Check if the guess is correct, too high, or too low
                if (guess == number) {
                    // The guess is correct, print a congratulatory message and break the loop
                    System.out.println("You got it! The number was " + number + ".");
                    break;
                } else if (guess > number) {
                    // The guess is too high, print a hint and continue the loop
                    System.out.println("Your guess is too high.");
                } else {
                    // The guess is too low, print a hint and continue the loop
                    System.out.println("Your guess is too low.");
                }

                // Check if the user has reached the maximum number of attempts
                if (attempts == maxAttempts) {
                    // The user has run out of attempts, print a failure message and break the loop
                    System.out.println("Sorry, you have used up all your attempts. The number was " + number + ".");
                    break;
                }
            }

            // Update the score based on the number of attempts taken
            score += maxAttempts - attempts;

            // Print the score after each round
            System.out.println("Your score after round " + round + " is: " + score);
        }

        // Print a farewell message and close the scanner object
        System.out.println("\nThank you for playing the number guessing game! Your final score is: " + score);
        scanner.close();
	}

}
