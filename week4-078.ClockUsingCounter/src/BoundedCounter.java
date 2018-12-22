/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kawon
 */
public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.upperLimit = upperLimit;
        this.value = 0;
    }

    public void next() {
        // write code here
        if (this.value < this.upperLimit) {
            this.value++;
        }
        else {
            this.value = 0;
        }
    }

    public String toString() {
        // write code here
        return String.format("%02d",this.value);
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int val) {
        if (val >= 0 && val <= this.upperLimit) {
            this.value = val;
        }
    }
}
