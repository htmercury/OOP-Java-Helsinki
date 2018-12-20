import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String input = reader.nextLine();
        firstThreeChar(input);
    }
    
    public static void firstThreeChar(String input) {
        if (input.length() >= 3) {
            for (int i = 0; i < 3; i++) {
                System.out.format("%d. character: %s\n", i+1, input.charAt(i));
            }
        }
    }
    
    
}
