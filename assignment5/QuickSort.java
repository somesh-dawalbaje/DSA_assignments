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


