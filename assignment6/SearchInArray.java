class SearchInArray{

    public static int linearSearch(int arr[], int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int arr[], int key){
        int s=0;
        int e=arr.length;
        while (s<=e) {
            int mid=s+(e-s)/2;
            if(arr[mid]==key)
                return mid;
            if(arr[mid]<key)
                s=mid+1;
            else
                e=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(linearSearch(arr, 5));
        System.out.println(binarySearch(arr, 4));
    }
}