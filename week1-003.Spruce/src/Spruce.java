public class Spruce {
    
    public static void treeTop() {
        int i = 0;
        String curr = "***";
        while (i < 4) {
            System.out.format("%"+(i+6)+"s%n", curr);
            curr += "**";
            i++;
        }
    }

    public static void main(String[] args) {

        // Write code here
        System.out.println("    *");
        treeTop();
        System.out.println("    *");
    }

}
