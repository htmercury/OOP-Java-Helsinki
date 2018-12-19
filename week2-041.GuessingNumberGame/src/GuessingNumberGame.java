
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int numGuess = 0;
        while(true) {
            System.out.println("Guess a number: ");
            int guess = reader.nextInt();
            if (guess == numberDrawn) {
                break;
            }
            numGuess++;
            String result = guess > numberDrawn ? "lesser" : "greater";
            System.out.format("The number is %s, guesses made: %d\n", result, numGuess);
        }
        System.out.println("Congratulations, your guess is correct!");
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
