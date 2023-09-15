public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int numSteps = 0;
        // Loops until n reaches 0
        while (n > 0) {
            // Check whether n is even or odd
            if (n % 2 == 0) {
                n = n / 2;
            }
            else {
                n = n - 1;
            }
            numSteps++;
        }
        System.out.println(numSteps);
    }
}
