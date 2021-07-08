package sortingTasks;

public class SortingAlgortitms {
    private SortingAlgortitms() {
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }

    private static void swap(int[] array, int n, int m) {
        int temp = array[n];
        array[n] = array[m];
        array[m] = temp;
    }

    private static int partition(int[] array, int begin, int end) {
        int pivot = end;
        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                 swap(array, counter, i);
                counter++;
            }
        }
      swap(array, pivot, counter);
        return counter;
    }

    public static void quickSort(int[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot - 1);
        quickSort(array, pivot + 1, end);
    }
}
