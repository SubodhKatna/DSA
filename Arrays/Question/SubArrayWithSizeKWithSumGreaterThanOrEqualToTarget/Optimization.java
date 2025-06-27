package Question.SubArrayWithSizeKWithSumGreaterThanOrEqualToTarget;

public class Optimization {
    public static void main(String[] args) {
        // Test Case 1
        int[] arr1 = {1, 2, 3, 4, 5};
        int size1 = 2;
        int target1 = 5;
        System.out.println("Test Case 1: " + NumberOfSubArrays(arr1, size1, target1)); // Expected: 3 (subarrays: [2,3], [3,4], [4,5])

        // Test Case 2
        int[] arr2 = {2, 1, 1, 1, 2};
        int size2 = 3;
        int target2 = 4;
        System.out.println("Test Case 2: " + NumberOfSubArrays(arr2, size2, target2)); // Expected: 2 (subarrays: [2,1,1], [1,1,2])

        // Test Case 3
        int[] arr3 = {5, 1, 2, 3, 1};
        int size3 = 1;
        int target3 = 3;
        System.out.println("Test Case 3: " + NumberOfSubArrays(arr3, size3, target3)); // Expected: 3 (elements: [5], [3])

        // Test Case 4
        int[] arr4 = {1, 1, 1, 1};
        int size4 = 2;
        int target4 = 3;
        System.out.println("Test Case 4: " + NumberOfSubArrays(arr4, size4, target4)); // Expected: 0

        // Test Case 5
        int[] arr5 = {10, 20, 30, 40, 50};
        int size5 = 3;
        int target5 = 100;
        System.out.println("Test Case 5: " + NumberOfSubArrays(arr5, size5, target5)); // Expected: 1 (subarray: [30,40,50])
    }


    public static int NumberOfSubArrays(int[] arr, int size, int target){
        int len = arr.length;
        int count = 0;
        int sum = 0;
        for(int i =0; i < size; i++){
            sum += arr[i];
        }
        if(sum >= target)count++;
        for(int i = 1; i <= len-size; i++){
            sum = sum + arr[i+size-1] - arr[i-1];
            if(sum >= target) count++;
        }
        return count;
    }
}
