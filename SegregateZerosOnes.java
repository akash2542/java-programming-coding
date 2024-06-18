import java.util.Arrays;

public class SegregateZerosOnes {
    public static void main(String[] args) {
        int[] array = {0, 1, 0, 1, 1, 0, 0, 1};
        
        System.out.println("Original Array: " + Arrays.toString(array));
        
        segregate(array);
        
        System.out.println("Array after segregation: " + Arrays.toString(array));
    }

    public static void segregate(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // Move left pointer until it points to a non-zero element
            while (array[left] == 0 && left < right) {
                left++;
            }

            // Move right pointer until it points to a non-one element
            while (array[right] == 1 && left < right) {
                right--;
            }

            // Swap if left pointer is pointing to a 1 and right pointer is pointing to a 0
            if (left < right) {
                array[left] = 0;
                array[right] = 1;
                left++;
                right--;
            }
        }
    }
}
