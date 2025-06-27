package Sorting.Question.Question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class EvenAndOddInOrder {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 6, 8, 3, 7, 4, 9};

        rearrangeEvenOdd(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void rearrangeEvenOdd(int[] arr) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        Collections.sort(even);
        Collections.sort(odd);

        int index = 0;
        for (int num : even) {
            arr[index++] = num;
        }
        for (int num : odd) {
            arr[index++] = num;
        }
    }
}
