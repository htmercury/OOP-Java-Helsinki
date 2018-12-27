
import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        BirdsDb bd = new BirdsDb();
        
        while (true) {
            String command = reader.nextLine();
            if (command.equals("Quit")) {
                break;
            }
            else if (command.equals("Add")) {
                System.out.println("Name: ");
                String name = reader.nextLine();
                System.out.println("Latin Name: ");
                String latin = reader.nextLine();
                bd.add(name, latin);
            }
            else if (command.equals("Observation")) {
                System.out.println("What was observed:?");
                String name = reader.nextLine();
                bd.observe(name);
            }
            else if (command.equals("Show")) {
                System.out.println("What?");
                String name = reader.nextLine();
                bd.show(name);
            }
            else if (command.equals("Statistics")) {
                bd.stats();
            }
        }
    }

}
