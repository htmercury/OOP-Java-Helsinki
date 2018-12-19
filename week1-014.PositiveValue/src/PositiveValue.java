
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here:
        System.out.println("Type a number: ");
        int num = reader.nextInt();
        
        String res = num > 0 ? "" : "not ";
        System.out.format("The number is %spositive.", res);
    }
}
