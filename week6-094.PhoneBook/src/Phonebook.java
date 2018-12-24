
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author htmercury
 */
public class Phonebook {
    private ArrayList<Person> persons;

    public Phonebook() {
        persons = new ArrayList<Person>();
    }
    
    public void add(String name, String number) {
        Person p = new Person(name, number);
        persons.add(p);
    }
    
    public void printAll() {
        for (Person p : persons) {
            System.out.println(p);
        }
    }
    
    public String searchNumber(String name) {
        for (Person p : persons) {
            if (p.getName().equals(name)) {
                return p.getNumber();
            }
        }
        
        return "number not known";
    }
}
