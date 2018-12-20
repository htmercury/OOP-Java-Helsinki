
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        
        while (true) {
            System.out.println("Type a word: ");
            String input = reader.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            words.add(input);
        }
        
        System.out.println("You typed the following words:");
        Collections.sort(words);
        for (String w : words) {
            System.out.println(w);
        }
    }
}
