// Write a Java program that displays the number of characters and words in a text.

import java.util.Scanner;

public class TextAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        int characterCount = text.length();
        String[] words = text.trim().split("\\s+");
        int wordCount = words.length;

        System.out.println("Number of characters: " + characterCount);
        System.out.println("Number of words: " + wordCount);
    }
}
