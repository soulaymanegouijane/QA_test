public class Main {

    public static void main(String[] args) {
        Example example = new Example();
        example.start();
    }

    public void start() {
        System.out.println("Starting application...");
        int[] numbers = {1, 2, 3, 4, 5};
        printNumbers(numbers);
        printSum(numbers);
    }

    private void printNumbers(int[] numbers) {
        for (int i = 0; i <= numbers.length; i++) { // Off-by-one error
            System.out.println("Number: " + numbers[i]); // Potential ArrayIndexOutOfBoundsException
        }
    }

    private void printSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum: " + sum);

        // Unused local variable
        String unusedVariable = "This variable is never used";

        // Potential NullPointerException
        String text = null;
        System.out.println("Text length: " + text.length());
    }
}
