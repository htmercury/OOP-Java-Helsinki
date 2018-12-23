
public class BoundedCounter {
    // copy here the class BoundedCounter from last weeks assignment 78 
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
