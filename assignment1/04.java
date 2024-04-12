class Demo{

    
    public static int reverseNum(int n,int r){
        if(n==0){
            return r;
        }
        int ld=n%10;
        r=r*10+ld;
        return reverseNum(n/10,r);
    }
    public static void main(String[] args) {
        int a=111;
        int reverse=0;
        reverse=reverseNum(a,reverse);
        if(reverse==a)
            System.out.println("palindrome");
    }
}