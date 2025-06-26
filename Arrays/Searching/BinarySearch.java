package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15}; // Sorted array required for binary search

        int[] testCases = {7, 2, 11, 16, 1, 15}; // Multiple targets to test

        for (int target : testCases) {
            boolean result = Search(arr, target);
            System.out.println("Searching for " + target + ": " + result);
        }
    }

    public static boolean Search(int[] arr, int index) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + (right - left) / 2) ;

            if (arr[mid] > index) {
                right = mid - 1;
            } else if (arr[mid] < index) {
                left = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
