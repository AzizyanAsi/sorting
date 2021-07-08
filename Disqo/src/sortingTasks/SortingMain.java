package sortingTasks;

import java.util.Arrays;

import static sortingTasks.SortingAlgortitms.insertionSort;
import static sortingTasks.SortingAlgortitms.quickSort;

public class SortingMain {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 7, 4, 3, 1, 6};
        int[] arr1 = new int[]{15, 13, 14, 30, 20};
        System.out.println("before insertion sort");
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("\nafter insertion sort");
        System.out.println(Arrays.toString(arr));
        System.out.println("\nbefore quick sort");
        System.out.println(Arrays.toString(arr1));
        quickSort(arr1, 0, 4);
        System.out.println("\nafter  quick sort");
        System.out.println(Arrays.toString(arr1));
    }
}
