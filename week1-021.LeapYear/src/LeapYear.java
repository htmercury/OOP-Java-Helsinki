
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a year: ");
        int year = reader.nextInt();
        
        String res;
        if ((year%400 == 0) || (year%100 != 0 && year%4 == 0)) {
            res = "";
        }
        else {
            res = "not ";
        }
        
        System.out.format("The year is %sa leap year.", res);
    }
}
