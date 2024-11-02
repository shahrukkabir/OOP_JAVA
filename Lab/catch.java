// Write a Java program that explains the use of multiple catch blocks.

import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            System.out.print("Enter a divisor: ");
            int divisor = scanner.nextInt();

            // Perform division
            int result = number / divisor;
            System.out.println("Result: " + result);

            // Create an array and access an element
            int[] array = {1, 2, 3};
            System.out.println("Accessing element at index 5: " + array[5]);

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Array index out of bounds.");
        } catch (Exception e) {
            System.out.println("Exception caught: An unexpected error occurred.");
        }
    }
}
