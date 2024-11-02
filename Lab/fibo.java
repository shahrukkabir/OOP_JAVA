//Write a Java program to find the Fibonacci series using recursive and non-recursive functions.

import java.util.Scanner;

public class Fibonacci {
    // Recursive method to calculate Fibonacci series
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Non-recursive method to calculate Fibonacci series
    public static void fibonacciNonRecursive(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci (Recursive): ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println();

        System.out.println("Fibonacci (Non-Recursive): ");
        fibonacciNonRecursive(n);
    }
}
