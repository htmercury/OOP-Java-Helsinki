
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
public class BirdsDb {
    private ArrayList<Bird> list = new ArrayList<Bird>();
    
    public BirdsDb() {}
    
    public void add(String name, String latin) {
        list.add(new Bird(name, latin));
    }
    
    public void observe(String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name.toLowerCase().equals(name.toLowerCase())) {
                list.get(i).count++;
                return;
            }
        }
        System.out.println("Is not a bird!");
    }
    
    public void show(String name) {
        for (Bird b : list) {
            if (b.name.toLowerCase().equals(name.toLowerCase())) {
                System.out.println(b);
                return;
            }
        }
        System.out.println("Is not a bird!");
    }
    
    public void stats() {
        for (Bird b : list) {
            System.out.println(b);
        }
    }
}
