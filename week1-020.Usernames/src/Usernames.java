
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your username: ");
        String name = reader.nextLine();
        
        System.out.println("Type your password: ");
        String pass = reader.nextLine();
        
        boolean user1 = name.equals("alex") && pass.equals("mightyducks");
        boolean user2 = name.equals("emily") && pass.equals("cat");
        if (user1 || user2) {
            System.out.println("You are now logged into the system!");
        }
        else {
            System.out.println("Your username or password was invalid!");
        }
        
    }
}
