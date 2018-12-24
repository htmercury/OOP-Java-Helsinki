
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // Write code here
        String res = "";
        for (int n : array) {
            res += (n + ", ");
        }
        System.out.println(res.substring(0, res.length()-2));
    }
}
