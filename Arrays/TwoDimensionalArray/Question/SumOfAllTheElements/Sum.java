package TwoDimensionalArray.Question.SumOfAllTheElements;

public class Sum {
    public static void main(String[] args) {
        // Test Case 1
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Test Case 1 - Sum: " + SumOFElement(arr1)); // Expected: 45

        // Test Case 2
        int[][] arr2 = {
                {10, 20},
                {30, 40}
        };
        System.out.println("Test Case 2 - Sum: " + SumOFElement(arr2)); // Expected: 100

        // Test Case 3
        int[][] arr3 = {
                {0, 0, 0},
                {0, 0, 0}
        };
        System.out.println("Test Case 3 - Sum: " + SumOFElement(arr3)); // Expected: 0

        // Test Case 4
        int[][] arr4 = {
                {1}
        };
        System.out.println("Test Case 4 - Sum: " + SumOFElement(arr4)); // Expected: 1

        // Test Case 5
        int[][] arr5 = {
                {-1, -2},
                {-3, -4}
        };
        System.out.println("Test Case 5 - Sum: " + SumOFElement(arr5)); // Expected: -10
    }

    public static int SumOFElement(int[][] arr){
        int sum = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        return sum;
    }
}
