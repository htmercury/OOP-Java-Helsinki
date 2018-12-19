
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here 
        System.out.println("Type the radius: ");
        double rad = reader.nextDouble();
        
        System.out.format("Circumference of the circle: %f", 2*Math.PI*rad);
    }
}
