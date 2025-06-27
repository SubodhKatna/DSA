package Question.DutchNationalFlagAlgorithm;

import java.util.Arrays;

public class answer {

    public static void main(String[] args) {
        // Test Case 1
        int[] arr1 = {0, 1, 2, 0, 1, 2};
        Sort(arr1);
        System.out.println("Test Case 1: " + Arrays.toString(arr1)); // Expected: [0, 0, 1, 1, 2, 2]

        // Test Case 2
        int[] arr2 = {2, 2, 1, 0, 0, 1};
        Sort(arr2);
        System.out.println("Test Case 2: " + Arrays.toString(arr2)); // Expected: [0, 0, 1, 1, 2, 2]

        // Test Case 3
        int[] arr3 = {1, 1, 1, 1};
        Sort(arr3);
        System.out.println("Test Case 3: " + Arrays.toString(arr3)); // Expected: [1, 1, 1, 1]

        // Test Case 4
        int[] arr4 = {2, 0, 1};
        Sort(arr4);
        System.out.println("Test Case 4: " + Arrays.toString(arr4)); // Expected: [0, 1, 2]

        // Test Case 5
        int[] arr5 = {0, 0, 0};
        Sort(arr5);
        System.out.println("Test Case 5: " + Arrays.toString(arr5)); // Expected: [0, 0, 0]
    }

    public static void Sort(int[] arr){
        int low = 0; int mid = 0; int high = arr.length-1;
        while(mid <=high){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
    }
}
