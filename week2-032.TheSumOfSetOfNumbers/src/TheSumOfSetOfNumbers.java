
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Until what? ");
        int max = reader.nextInt();
        
        System.out.format("Sum is %d", max*(max + 1)/2);

    }
}
