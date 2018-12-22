import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;
    private String symbolGroup;
    private Random rand = new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        this.symbolGroup = "abcdefghijklmnopqrstuvwxyz";
    }

    public String createPassword() {
        // write code that returns a randomized password
        String result = "";
        for (int i = 0; i < this.length; i++) {
            int idx = rand.nextInt(26);
            result += this.symbolGroup.charAt(idx);
        }
        return result;
    }
}
