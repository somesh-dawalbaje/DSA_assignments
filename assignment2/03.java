class MeanOfArray{
    
    public static int arraySum(int[] arr, int i) {
        if (i == arr.length) {
            return 0;
        }
        return arr[i] + arraySum(arr, i + 1);
    }

    /*public static double arrayAverage(int[] arr) {
        return arraySum(arr, 0) / (double) arr.length;
    }*/
    
    public static void main(String[] args) {
        int arr[]={1,5,7,8,6};
        int i=0;
        //System.out.println(arrayAverage(arr));
        System.out.println(arraySum(arr,i));

    }
}