/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author htmercury
 */
public class Bird {
    String name;
    String latin;
    int count;

    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.count = 0;
    }

    @Override
    public String toString() {
        return String.format("%s (%s): %d observations", name, latin, count);
    }
    
}
