package TwoDimensionalArray.Question.SnakeTraversal;

public class Snake {
    public static void main(String[] args) {
        // Test Case 1
        int[][] arr1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println("Test Case 1:");
        traversal(arr1);
        System.out.println();

        // Test Case 2
        int[][] arr2 = {
                {10, 20, 30},
                {40, 50, 60}
        };
        System.out.println("Test Case 2:");
        traversal(arr2);
        System.out.println();

        // Test Case 3
        int[][] arr3 = {
                {7, 8},
                {9, 10},
                {11, 12},
                {13, 14}
        };
        System.out.println("Test Case 3:");
        traversal(arr3);
        System.out.println();

        // Test Case 4
        int[][] arr4 = {
                {1},
                {2},
                {3}
        };
        System.out.println("Test Case 4:");
        traversal(arr4);
        System.out.println();

        // Test Case 5
        int[][] arr5 = {
                {1, 3, 5, 7, 9},
                {2, 4, 6, 8, 10}
        };
        System.out.println("Test Case 5:");
        traversal(arr5);
        System.out.println();
    }

    public static void traversal(int[][] arr) {
        int row = arr.length;
        for (int i = 0; i < row; i++) {
            int cols = arr[i].length;
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

