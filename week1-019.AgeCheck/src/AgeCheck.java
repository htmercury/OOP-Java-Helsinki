
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How old are you? ");
        int age = reader.nextInt();
        
        String res;
        
        if (age < 0 || age > 120) {
            res = "Impossible!";
        }
        else {
            res = "OK";
        }
        
        System.out.println(res);
    }
}
