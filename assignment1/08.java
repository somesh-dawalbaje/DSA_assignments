class AmicableNumbers{
    public static void main(String[] args) {
        int n=220;
        int m=284;
        int sum1=0;
        for (int i = 1; i < n; i++) {
            if(n%i==0)
                sum1=sum1+i;
        }
        int sum2=0;
        for (int i = 1; i < m; i++) {
            if(m%i==0)
                sum2=sum2+i;
        }
        if(sum1==m && sum2==n)
            System.out.println("amicable numbers");
        else
            System.out.println("not amicable numbers");
    }
}