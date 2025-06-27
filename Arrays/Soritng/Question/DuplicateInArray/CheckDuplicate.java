package Soritng.Question.DuplicateInArray;

public class CheckDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2};

        if (Duplicate(arr)) {
            System.out.println("Duplicate found");
        } else {
            System.out.println("No duplicates");
        }
    }

    public static boolean Duplicate(int[] arr){
        Sort(arr);
        for(int i = 1; i < arr.length;i++){
            if(arr[i-1] == arr[i]){
                return true;
            }
        }
        return false;
    }

    public static void Sort(int[] arr){
        int len = arr.length;
        for(int i = 0; i < len; i++){
            int minIndex = i;
            for(int j = i+1; j < len; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
