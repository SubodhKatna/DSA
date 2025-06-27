package Soritng.Question.MergeSortedArrays;
import java.util.Arrays;

public class MergeTwoSortedArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 6, 7};
        int[] arr2 = {2, 4, 6, 6, 8};

        int[] result = merged(arr1, arr2);
        System.out.println("Merged Array: " + Arrays.toString(result));
    }

    public static int[] merged(int[] arr1, int[] arr2){
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] merged = new int[len1+len2];
        int i = 0;
        int j = 0;
        int index = 0;
        while(i < len1 && j < len2){
            if(arr1[i] <= arr2[j]){
                merged[index] = arr1[i];
                i++;
                index++;
            }
            else{
                merged[index] = arr2[j];
                j++;
                index++;
            }
        }
            while(i < len1){
                merged[index] = arr1[i];
                i++;
                index++;
        }
            while(j < len2){
                merged[index] = arr2[j];
                j++;
                index++;

        }
        return  merged;
    }
}
