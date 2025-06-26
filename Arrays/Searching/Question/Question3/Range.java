public class Range {

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38};
        int k = 13;
        int index = 6;

        int result = range(arr, k, index);
        System.out.println("Number of elements in range: " + result);
    }

    public static int range(int[] arr, int k, int index) {
        int min = index - k;
        int max = index + k;
        int count = 0;
        for (int j : arr) {
            if (j >= min && j <= max) {
                count++;
            }
        }
        return count;
    }
}
