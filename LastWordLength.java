public class LastWordLength {
    public static int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0)
            return 0;
        
        int length = 0;
        int i = s.length() - 1;
        
        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ')
            i--;
        
        // Calculate the length of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        
        return length;
    }
    
    public static void main(String[] args) {
        String input = "Hello World";
        int length = lengthOfLastWord(input);
        System.out.println("Length of the last word: " + length);
    }
}
