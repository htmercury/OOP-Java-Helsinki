
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here 
        System.out.println("How old are you? ");
        int age = reader.nextInt();
        
        String res = age >= 18 ? "" : "not ";
        System.out.format("You have %sreached the age of majority!.", res);
    }
}
