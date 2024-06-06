import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;
        int userGuess;
        
        // Loop until the user guesses the correct number
        while (true) {
            System.out.print("Enter your guess (between 1 and 100): ");
            userGuess = scanner.nextInt();
            
            // Compare user's guess with the generated number
            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                break; // Exit the loop if the guess is correct
            } else if (userGuess < randomNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }
        
        scanner.close();
    }
}