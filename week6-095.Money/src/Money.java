
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added) {
        return new Money(euros + added.euros, cents + added.cents);
    }
    
    public boolean less(Money compared) {
        if (euros < compared.euros) {
            return true;
        }
        else if (euros == compared.euros && cents < compared.cents) {
            return true;
        }
        return false;
    }
    
    public Money minus(Money decremented) {
        int e;
        int c;
        int delta = 0;
        if (cents < decremented.cents) {
            delta = 1;
            c = cents - decremented.cents + 100;
        }
        else if (cents == decremented.cents) {
            c = 0;
        }
        else {
            c = decremented.cents - cents + 100;
        }
        e = euros - decremented.euros - delta;
        
        return e < 0 ? new Money(0, 0) : new Money(e, c);
    }

}
