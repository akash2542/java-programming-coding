import java.util.Arrays;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int[] array = {31,42,51,39,44,86,1,13};
        
        int secondHighest = findSecondHighest(array);
        
        System.out.println("Second highest number: " + secondHighest);
    }
    
    public static int findSecondHighest(int[] array) {
        Arrays.sort(array); // Sort the array in ascending order
        
        // Traverse from the end of the array to find the second highest
        for (int i = array.length - 2; i >= 0; i--) {
            if (array[i] != array[array.length - 1]) {
                return array[i];
            }
        }
        
        return -1; // If array length is less than 2 or all elements are same
    }
}
