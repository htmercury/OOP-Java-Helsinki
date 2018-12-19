public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        String result = "";
        for (int i = 0; i < amount; i++) {
            result += "*";
        }
        System.out.println(result);
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        String result = "";
        for (int i = 0; i < amount; i++) {
            result += " ";
        }
        System.out.format(result);
    }

    public static void printTriangle(int size) {
        // 40.2
        for (int i = 1; i <= size; i++) {
            printWhitespaces(size - i);
            printStars(i);
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int size = height;
        int stars = 1;
        for (int i = 1; i <= height; i++) {
            printWhitespaces(size - stars);
            printStars(stars);
            stars += 2;
            size++;
        }
        for (int j = 0; j < 2; j++) {
            printWhitespaces(height - 3 + 1);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
