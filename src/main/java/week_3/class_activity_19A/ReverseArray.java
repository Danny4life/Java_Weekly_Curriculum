package week_3.class_activity_19A;

import java.util.Arrays;

public class ReverseArray {
    // reverse an array is a common array algorithm question

    // using pseudocode
    // 1. Get the length of the input array
    // 2. Create a new array to store the reversed elements
    // 3. Loop through the reverseArr in reverse order
    // 4. Calculate the index to retrieve the element from the original array
    // 5. The index is calculated by subtracting the current index of reverseArr from the total length
    // 6. This effectively reverses the order of elements in the original array

    public static int[] reverseArr(int[] arr) {
        int len = arr.length;
        int[] reverseArr = new int[len];
        for (int i = reverseArr.length - 1; i >= 0; i--) {
            reverseArr[i] = arr[len - 1 - i];
        }

        return reverseArr;
    }

    public static void main(String[] args) {
        int[] arrays = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(reverseArr(arrays)));
    }
}
