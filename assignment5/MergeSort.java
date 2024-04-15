class MergeSort{

    void merge(int arr[], int s, int mid, int e){
        int firstHalf=mid-s+1;
        int secondHalf=e-mid;

        int L[]=new int[firstHalf];
        int R[]=new int[secondHalf];

        for (int i = 0; i < firstHalf; ++i)
            L[i] = arr[s + i];
        for (int j = 0; j < secondHalf; ++j)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
    
        int k = s;
        while (i < firstHalf && j < secondHalf) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        
        while (i < firstHalf) {
            arr[k] = L[i];
            i++;
            k++;
        }

      
        while (j < secondHalf) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void sort(int arr[], int s, int e){
       if(s<e){
        int mid=(s+(e-s)/2);
        sort(arr, s, mid);
        sort(arr, mid + 1, e);
        merge(arr, s, mid, e);
       }
    }

    void display(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args){
        int arr[]={45,87,42,56,74,1,0};
        MergeSort ms=new MergeSort();
        ms.display(arr);
        ms.sort(arr,0,arr.length-1);
        ms.display(arr);
    }
}