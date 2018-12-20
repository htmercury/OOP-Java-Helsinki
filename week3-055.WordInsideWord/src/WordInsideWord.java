
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String orig = reader.nextLine();
        System.out.println("Type the second word: ");
        String inner = reader.nextLine();
        
        String res = "not ";
        
        if (orig.indexOf(inner) != -1) {
            res = "";
        }
        
        System.out.format("The word '%s' is %sfound in the word '%s'.\n",
                inner, res, orig);
    }
}
