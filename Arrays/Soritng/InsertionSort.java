public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};

        Sort(arr);
        Print(arr);
    }

    private static void Print(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void Sort(int[] arr) {
        int len = arr.length;

        for (int i = 1; i < len; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}

