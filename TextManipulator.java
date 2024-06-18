import java.util.Scanner;

public class TextManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input text from the user
        System.out.println("Enter the text:");
        String text = scanner.nextLine();

        // 1. Length of the given text
        int textLength = text.length();
        System.out.println("Length of the text: " + textLength);

        // 2. Subset of the given text
        System.out.println("Enter the start index of the subset:");
        int startIndex = scanner.nextInt();
        System.out.println("Enter the end index of the subset:");
        int endIndex = scanner.nextInt();
        String subset = text.substring(startIndex, endIndex);
        System.out.println("Subset of the text: " + subset);

        // 3. Count the vowels
        int vowelCount = 0;
        for (char c : text.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels in the text: " + vowelCount);

        // 4. Number of words and sentences in text
        String[] words = text.split("\\s+");
        int wordCount = words.length;
        String[] sentences = text.split("[.!?]");
        int sentenceCount = sentences.length;
        System.out.println("Number of words in the text: " + wordCount);
        System.out.println("Number of sentences in the text: " + sentenceCount);

        // 5. Check if text is palindrome
        boolean isPalindrome = true;
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is the text a palindrome? " + isPalindrome);

        // 6. Convert text into upper case and vice versa
        System.out.println("Text in uppercase: " + text.toUpperCase());
        System.out.println("Text in lowercase: " + text.toLowerCase());

        scanner.close();
    }
}
