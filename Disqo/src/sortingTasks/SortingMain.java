package sortingTasks;

import static sortingTasks.SortingAlgortitms.insertionSort;
import static sortingTasks.SortingAlgortitms.quickSort;

public class SortingMain {
    public static void main(String[] args) {
    int[] arr= new int[]{2, 5, 7, 4, 3, 1, 6};
        int[] arr1= new int[]{15,13,14,30,20};
        System.out.println("before insertion sort");
        for (int m : arr) {
            System.out.print(m + " ");
        }
      insertionSort(arr);
        System.out.println("\nafter insertion sort");
        for (int m : arr) {
            System.out.print(m + " ");
        }
        System.out.println("\nbefore quick sort");
        for (int m : arr1) {
            System.out.print(m + " ");
        }
       quickSort(arr1,0,4);
        System.out.println("\nafter  quick sort");
        for (int m : arr1) {
            System.out.print(m + " ");
        }
    }



}
