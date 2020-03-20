import java.util.Arrays;

public class MainFile extends SortingAlgos{
    public static void main(String[] args) {
        SortingAlgos sorter = new SortingAlgos();
        System.out.println("Hello");
        int arr[] = {4,5,6,2,1,0};
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(arr));
        // sorter.bubbleSort(arr);
        // System.out.println("Sorted Array using Bubble Sort");
        // System.out.println(Arrays.toString(arr));
        sorter.insertionSort(arr);
        System.out.println("Sorted Array using selection Sort");
        System.out.println(Arrays.toString(arr));

    }

}
