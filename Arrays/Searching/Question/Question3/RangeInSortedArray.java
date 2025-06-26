import java.util.Arrays;

public class RangeInSortedArray {

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38};
        int k = 13;
        int index = 6;

        int result = rangeSorted(arr, k, index);
        System.out.println("Number of elements in range: " + result);
    }

    public static int rangeSorted(int[] arr, int k, int index) {
        int min = index - k;
        int max = index + k;

        int left = lowerBound(arr, min);
        int right = upperBound(arr, max);

        return right - left;
    }

    // Find first index where arr[i] >= target
    private static int lowerBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] < target) low = mid + 1;
            else high = mid;
        }
        return low;
    }

    // Find first index where arr[i] > target
    private static int upperBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= target) low = mid + 1;
            else high = mid;
        }
        return low;
    }
}
