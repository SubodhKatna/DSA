package Sorting;

public class BubbleSort {

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
            boolean swapped = false;
            for(int j = 0; j < len-i-1;j++){

                if(arr[j] > arr[j + 1]){
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(!swapped) break;
        }
    }
}
