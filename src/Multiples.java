public class Multiples {
    public static void main(String[] args) {
        int numMultiples = 0;
        // Loop through numbers to 1000
        for (int i = 3; i < 1000; i++) {
            // Check if multiple of 3
            if (i % 3 == 0) {
                numMultiples++;
            }
            // Check if multiple of 5
            else if (i % 5 == 0) {
                numMultiples++;
            }
        }
        System.out.println(numMultiples);
    }
}
