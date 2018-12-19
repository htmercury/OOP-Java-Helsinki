
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        String guess = "";
        while (true) {
            System.out.println("Type the password: ");
            guess = reader.nextLine();
            if (guess.equals(password)) {
                break;
            }
            System.out.println("Wrong!");
        }
        System.out.println("Right!\n");
        System.out.format("The secret is: %s", password);
    }
}
