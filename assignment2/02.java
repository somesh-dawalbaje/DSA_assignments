class SumOfNumbers{
    public static int sumOfNumber(int n){
        if(n==0)
            return n;
        return n+sumOfNumber(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(sumOfNumber(n));
    }
}