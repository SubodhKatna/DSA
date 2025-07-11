public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 9, 8, 2, 4, 7};

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
        for(int i = 0; i < len-1; i++){
            int minIndex = i;
            for(int j = i+1; j< len; j++){
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}