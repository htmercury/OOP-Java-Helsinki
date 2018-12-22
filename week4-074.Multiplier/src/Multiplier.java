/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kawon
 */
public class Multiplier {
    private int n;

    public Multiplier(int number) {
        this.n = number;
    }
    
    public int multiply(int otherNumber) {
        return this.n * otherNumber;
    }
}
