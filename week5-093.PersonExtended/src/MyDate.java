
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differneceInYears(MyDate compared) {
        int delta = 0;
        if (earlier(compared)) {
            if (compared.month < month) {
                delta = 1;
            }
            else if (compared.month == month && compared.day < day) {
                delta = 1;
            }
        }
        else {
            if (month < compared.month) {
                delta = 1;
            }
            else if (month == compared.month && day < compared.day) {
                delta = 1;
            }
        }
        return Math.abs(year - compared.year) - delta;
    }

  
}
