
package numberguess;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // generate an array range of the number to guess 
        int[] targetNumbers = new int[5];
        for (int i = 0; i < targetNumbers.length; i++) {
            targetNumbers[i] = random.nextInt(100) + 1;
        }
        System.out.println("Welcome to the Number Guessing Game");
        System.out.println("Try to guess the numbers between 1 and 100.");
        // the  system will tell the user the range of number to guess
        
        int numberOfGuess = 0;
        boolean GuessedCorrectly = false;

        int targetIndex = random.nextInt(targetNumbers.length);
        int targetNumber = targetNumbers[targetIndex];
        // choose a random target number from the array
        while (!GuessedCorrectly) {
            try {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                numberOfGuess++;

              
                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    GuessedCorrectly = true;
                } else {
                   if (userGuess < targetNumber) {
                        System.out.println("Incorrect! Your guess is too low. Try again.");
                    } else {
                        System.out.println("Incorrect! Your guess is too high. Try again.");
                    }
                }
            } catch (InputMismatchException e) {
                // the system will inform the user to put integer 
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine(); // Clear the input buffer
            }
        }
                // it shows if the user gets a low or high guess and tell the user "invalid input" if its not integer
    }
}
