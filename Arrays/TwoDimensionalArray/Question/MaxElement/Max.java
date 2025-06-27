package TwoDimensionalArray.Question.MaxElement;

public class Max {

    public static void main(String[] args) {
        // Test Case 1
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Test Case 1 - Max: " + MaxElement(arr1)); // Expected: 9

        // Test Case 2
        int[][] arr2 = {
                {-1, -2, -3},
                {-4, -5, -6}
        };
        System.out.println("Test Case 2 - Max: " + MaxElement(arr2)); // Expected: -1

        // Test Case 3
        int[][] arr3 = {
                {42}
        };
        System.out.println("Test Case 3 - Max: " + MaxElement(arr3)); // Expected: 42

        // Test Case 4
        int[][] arr4 = {
                {0, 0},
                {0, 0}
        };
        System.out.println("Test Case 4 - Max: " + MaxElement(arr4)); // Expected: 0

        // Test Case 5
        int[][] arr5 = {
                {100, 200},
                {150, 180}
        };
        System.out.println("Test Case 5 - Max: " + MaxElement(arr5)); // Expected: 200
    }


    public static int MaxElement(int[][] arr){
        int max = arr[0][0];
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }
}
