class Demo{

    
    public static void main(String[] args) {
        int n=45;
        
        for (int i = 2; i <=n; i++) {
            int count=0;
            for (int j = 2; j <=n; j++) {
                if(i%j==0){
                   count++;
                }
            }
            if(count==1 && n%i==0)
                System.out.print(i+" ");
        }    
    }
}