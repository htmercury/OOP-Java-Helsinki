import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int input = 0;
        int sum = 0;
        int eCount = 0;
        int oCount = 0;
        
        System.out.println("Type numbers: ");
        while(true) {
            input = reader.nextInt();
            if (input == -1) {
                break;
            }
            if (input%2 == 0) {
                eCount++;
            }
            else {
                oCount++;
            }
            sum += input;
        }
        System.out.println("Thank you and see you later!");
        
        System.out.format("The sum is %d\n", sum);
        System.out.format("How many numbers: %d\n", eCount + oCount);
        System.out.format("Average: %f\n", 1.0*sum/(eCount + oCount));
        System.out.format("Even numbers: %d\n", eCount);
        System.out.format("Odd numbers: %d\n", oCount);

    }
}
