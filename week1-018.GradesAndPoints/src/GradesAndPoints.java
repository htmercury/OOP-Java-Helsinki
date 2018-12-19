
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]: ");
        int points = reader.nextInt();
        
        String res;
        
        if (60-points <= 10) {
            res = "5";
        }
        else if (49-points <= 4) {
            res = "4";
        }
        else if (44-points <= 4) {
            res = "3";
        }
        else if (39-points <= 4) {
            res = "2";
        }
        else if (34-points <= 4) {
            res = "1";
        }
        else {
            res = "failed";
        }
        
        System.out.format("Grade: %s", res);
    }
}
