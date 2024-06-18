import java.util.Arrays;

public class ArrayInsertion {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int element = 10;
        int index = 2; // Index at which the element will be inserted

        System.out.println("Original Array: " + Arrays.toString(array));

        // Inserting the element at the specified index
        array = insertElement(array, element, index);

        System.out.println("Array after insertion: " + Arrays.toString(array));
    }

    public static int[] insertElement(int[] array, int element, int index) {
        int[] newArray = new int[array.length + 1];

        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == index) {
                newArray[i] = element;
            } else {
                newArray[i] = array[j];
                j++;
            }
        }

        return newArray;
    }
}
