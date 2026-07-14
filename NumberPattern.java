class NumberPattern {
    public static void main(String[] args) {
        int n = 5; // Starting number

        // Loop to print the pattern
        for (int i = n; i >= 1; i--) {
            // Print the current number 'i', i times
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
