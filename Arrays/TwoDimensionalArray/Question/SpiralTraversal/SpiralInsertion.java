package TwoDimensionalArray.Question.SpiralTraversal;

public class SpiralInsertion {

    public static void main(String[] args) {
        // Test Case 1: 3x3 Matrix
        int[][] matrix1 = new int[3][3];
        FillSpiral(matrix1);
        System.out.println("Test Case 1:");
        printMatrix(matrix1);

        // Test Case 2: 4x4 Matrix
        int[][] matrix2 = new int[4][4];
        FillSpiral(matrix2);
        System.out.println("Test Case 2:");
        printMatrix(matrix2);

        // Test Case 3: 3x4 Matrix
        int[][] matrix3 = new int[3][4];
        FillSpiral(matrix3);
        System.out.println("Test Case 3:");
        printMatrix(matrix3);


        // Test Case 4: 4x3 Matrix
        int[][] matrix4 = new int[4][3];
        FillSpiral(matrix4);
        System.out.println("Test Case 4:");
        printMatrix(matrix4);

        // Test Case 5: 1x5 Matrix
        int[][] matrix5 = new int[1][5];
        FillSpiral(matrix5);
        System.out.println("Test Case 5:");
        printMatrix(matrix5);

        // Test Case 6: 5x1 Matrix
        int[][] matrix6 = new int[5][1];
        FillSpiral(matrix6);
        System.out.println("Test Case 6:");
        printMatrix(matrix6);
    }

    public static void FillSpiral(int[][] matrix){
        int rows = matrix.length;
        int columns = matrix[0].length;
        int top = 0;
        int bottom = rows-1;
        int right = columns-1;
        int left = 0;
        int count = 1;
        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++){
                matrix[top][i] = count;
                count++;
            }
            top++;
            for(int i = top; i <= bottom; i++){
                matrix[i][right] = count;
                count++;
            }
            right--;
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    matrix[bottom][i] = count;
                    count++;
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    matrix[i][left] = count;
                    count++;
                }
                left++;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%3d ", val);
            }
            System.out.println();
        }
        System.out.println();
    }
}
