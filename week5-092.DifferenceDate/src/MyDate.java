
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
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

    public int differenceInYears(MyDate comparedDate) {        
        int delta = 0;
        if (earlier(comparedDate)) {
            if (comparedDate.month < month) {
                delta = 1;
            }
            else if (comparedDate.month == month && comparedDate.day < day) {
                delta = 1;
            }
        }
        else {
            if (month < comparedDate.month) {
                delta = 1;
            }
            else if (month == comparedDate.month && day < comparedDate.day) {
                delta = 1;
            }
        }
        return Math.abs(year - comparedDate.year) - delta;
    }

}
