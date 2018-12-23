
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        
        while (true) {
            System.out.println("name: ");
            String name = reader.nextLine();
            if (name.length() == 0) {
                break;
            }
            System.out.println("studentnumber: ");
            String id = reader.nextLine();
            list.add(new Student(name, id));
        }
        
        for (Student s : list) {
            System.out.println(s);
        }
        
        System.out.println("Give search term: ");
        String search = reader.nextLine();
        System.out.println("Result: ");
        for (Student s : list) {
            if (s.getName().contains(search)) {
                System.out.println(s);
            }
        }
    }
}
