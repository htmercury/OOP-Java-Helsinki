import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int max = reader.nextInt();
        int res = 1;
        
        while(max > 1) {
            res *= max;
            max--;
        }
        
        System.out.format("Factorial is %d", res);
    }
}
