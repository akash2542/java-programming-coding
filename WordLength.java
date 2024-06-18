public class WordLength {
    public static int[] wordLengths(String s) {
        String[] words = s.split(" "); // Split the string into words based on spaces
        int[] lengths = new int[words.length]; // Array to store lengths of words

        for (int i = 0; i < words.length; i++) {
            lengths[i] = words[i].length(); // Store length of each word
        }

        return lengths;
    }

    public static void main(String[] args) {
        String str = "Hello world this is a test"; // Example string
        int[] wordLengths = wordLengths(str);

        // Print the length of each word
        System.out.println("Length of each word in the string:");
        for (int i = 0; i < wordLengths.length; i++) {
            System.out.println("Word " + (i + 1) + ": " + wordLengths[i]);
        }
    }
}
