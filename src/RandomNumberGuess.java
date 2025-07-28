package RandomNumberGuess;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        int randomnum = (int)(Math.random() * 100) + 1; // Generate a random number between 1 and 100
        int guess = 0; // Initialize the user's guess
        int numofguesses = 0;
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        System.out.println("Welcome to the Random Number Guessing Game!");
        System.out.println("I have selected a random number between 1 and 100. Try to guess it!");
        while (guess != randomnum && numofguesses < 8) { // Loop until the user guesses the correct number
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt(); // Read the user's guess

            if (guess < randomnum) {
                System.out.println("Too low! Try again.");
                numofguesses++; // Increment the number of guesses
            } else if (guess > randomnum) {
                System.out.println("Too high! Try again.");
                numofguesses++; // Increment the number of guesses
            } else {
                System.out.println("Congratulations! You've guessed the number: " + randomnum);
            }
            if (numofguesses == 8 && guess != randomnum) {
                System.out.println("Sorry, you've used all your guesses. The number was: " + randomnum);
            }
        }
    }
}