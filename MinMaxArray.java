public class MinMaxArray {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 8, 15}; // Example array

        // Initialize min and max with the first element
        int min = numbers[0];
        int max = numbers[0];

        // Iterate through the array to find min and max
        for (int num : numbers) {
            if (num < min) {
                min = num; // Update min if a smaller number is found
            }
            if (num > max) {
                max = num; // Update max if a larger number is found
            }
        }

        // Output the results
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
}
