/* import java.util.Scanner;

class AverageCalculator {
    private double[] numbers;

    public AverageCalculator(double[] numbers) {
        this.numbers = numbers;
    }

    public double calculateAverage() {
        if (numbers.length == 0) {
            return 0; 
        }
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers separated by spaces: ");
        String[] input = scanner.nextLine().split(" ");
        double[] numbers = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Double.parseDouble(input[i]);
        }
        scanner.close();
        
        AverageCalculator avgCalc = new AverageCalculator(numbers);
        System.out.println("The average is: " + avgCalc.calculateAverage());
    }
} */
import java.util.Scanner;

class AverageCalculator {
    public static double calculateAverage(int[] numbers) {
        if (numbers.length == 0) {
            return 0; // To handle division by zero
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        
        System.out.println("The average is: " + calculateAverage(numbers));
    }
}



// o wow !!