public class MissingNumberInSortedArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 6, 7};
        System.out.println("Missing number: " + findMissing(arr));
    }

    public static int findMissing(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}
