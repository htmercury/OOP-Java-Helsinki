
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String input = reader.nextLine();
        allChars(input);
    }

    public static void allChars(String input) {
        for (int i = 0; i < input.length(); i++) {
            System.out.format("%d. character: %s\n", i + 1, input.charAt(i));
        }
    }
}
