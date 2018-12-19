
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.println("Type your name: ");
        String name1 = reader.next();
        System.out.println("Type your age: ");
        int age1 = reader.nextInt();
        
        System.out.println("Type your name: ");
        String name2 = reader.next();
        System.out.println("Type your age: ");
        int age2 = reader.nextInt();
        
        System.out.format("%s and %s are %d years old in total.",
                name1, name2, age1+age2);
    }
}
