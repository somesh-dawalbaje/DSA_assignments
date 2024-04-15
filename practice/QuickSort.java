/*public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {7, 2, 1, 6, 8, 5, 3, 4};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array
            int pivotIndex = partition(arr, low, high);

            // Recursively sort elements before and after the pivot
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        // Choose the pivot element (here, we'll choose the last element)
        int pivot = arr[high];
        int i = low - 1; // Index of the smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}*/

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]={45,884,12,25,6,1,3,7,88};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static int partition(int arr[], int s, int e){
        int pivot=arr[e];
        int i=s-1;

        for (int j = s; j < e; j++) {
            if(arr[j]<pivot){
                i++;

                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        int temp=arr[i+1];
        arr[i+1]=arr[e];
        arr[e]=temp;

        return i+1;

    }

    public static void quickSort(int arr[],int s, int e){
        if(s<e){
            int pivot=partition(arr,s,e);
            quickSort(arr, s, pivot-1);
            quickSort(arr, pivot+1, e);
        }
    }
     
}


