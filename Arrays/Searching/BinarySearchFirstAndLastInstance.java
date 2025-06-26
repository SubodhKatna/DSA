package Searching;

public class BinarySearchFirstAndLastInstance {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 7, 7, 9, 11, 13, 15}; // Sorted array with duplicates

        int[] testCases = {7, 2, 11, 16, 1, 15};

        for (int target : testCases) {
            int first = binarySearch(arr, target, true);
            int last = binarySearch(arr, target, false);

            if (first != -1) {
                System.out.println("Target " + target + " found from index " + first + " to " + last);
            } else {
                System.out.println("Target " + target + " not found in the array.");
            }
        }
    }

    // 🔄 Unified binary search function
    public static int binarySearch(int[] arr, int target, boolean findFirst) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                if (findFirst) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}