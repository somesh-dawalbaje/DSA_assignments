class Demo4{
    public static void main(String[] args) {
        /*int arr1[]={10,-4,2,0,2,3,7};
        int arr2[]={7,3,-4,0,3,2};*/
        int arr1[]={-2,5,1,-10,5};
        int arr2[]={-2,-10};
        int ans=0;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            int count=1;
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i]==arr2[j]){
                    count++;
                }
            }
            if(count==1){
                if(min>arr1[i])
                    min=arr1[i];
            }
        }
        System.out.println(min);
    }
}