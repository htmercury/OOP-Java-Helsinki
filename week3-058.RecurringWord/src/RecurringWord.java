
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>();
        
        String input;
        while (true) {
            System.out.println("Type a word: ");
            input = reader.nextLine();
            
            if (words.contains(input)) {
                break;
            }
            
            words.add(input);
        }
        
        System.out.format("You gave the word %s twice\n", input);
    }
}
