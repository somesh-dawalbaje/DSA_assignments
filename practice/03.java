class Demo2{
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int k=9;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==k)
                    System.out.println(i+" "+j);
            }
        }
    }
}