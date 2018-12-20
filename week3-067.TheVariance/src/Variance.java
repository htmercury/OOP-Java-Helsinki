import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int x : list) {
            sum += x;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        return 1.0*sum(list)/list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        double mean = average(list);
        double result = 0;
        for (int n : list) {
            result += Math.pow((n - mean),2);
        }
        // write code here
        return result/(list.size()-1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
