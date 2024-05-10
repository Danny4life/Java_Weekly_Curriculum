package week_3.class_activity_18A;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,3,5},{7,8,9}};

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println(arr[i][j] + "");
            }
            System.out.println();
        }
    }
}
