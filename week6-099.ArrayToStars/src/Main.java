
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        // write code here
        for (int n : array) {
            String res = "";
            for (int i = 0; i<n; i++) {
                res += "*";
            }
            System.out.println(res);
        }
    }
}
