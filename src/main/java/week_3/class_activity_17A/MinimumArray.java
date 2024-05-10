package week_3.class_activity_17A;

public class MinimumArray {
    // java program to return minimum array, is a common array algorithm
    public static int min(int[] arr){
        // this line assumes that the array is not empty
        int min = arr[0];

        for(int i = 1; i < arr.length; i++){
            // this line checks if the current element (arr[i]) being iterated over in the array is less than the current minimum value
            //if the current element is smaller, it updates the value of min to be the value of the current element
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] a = {33,6,10, 2};
        //System.out.println(a.length);

        System.out.println(min(a));
    }
}
