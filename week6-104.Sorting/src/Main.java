
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        // write the code here
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            smallest = smallest > array[i] ? array[i] : smallest;
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        // write the code here
        int s = 0;
        for (int i = 1; i < array.length; i++) {
            s = array[s] > array[i] ? i : s;
        }
        return s;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        // write the code here
        int s = index;
        for (int i = index + 1; i < array.length; i++) {
            s = array[s] > array[i] ? i : s;
        }
        return s;
    }

    public static void swap(int[] array, int index1, int index2) {
        // code goes here
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            int idx = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, idx);
            System.out.println(Arrays.toString(array));
        }
    }

}
