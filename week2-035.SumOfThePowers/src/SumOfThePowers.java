
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int max = reader.nextInt();
        int res = 0;
        
        for (int i = 0; i <= max; i++) {
            res += (int) Math.pow(2, i);
        }
        
        System.out.format("The result is %d", res);
    }
}
