
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("First: ");
        int first = reader.nextInt();
        
        System.out.println("Last: ");
        int last = reader.nextInt();
        
        int sum1 = (first-1)*first/2;
        int sum2 = last*(last+1)/2;
        System.out.format("The sum is %d", sum2-sum1);  
    }
}
