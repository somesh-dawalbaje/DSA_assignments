class GCDRecursion{
    
    public static int GCD(int a,int b){
        if(b==0)
            return a;
        else
            return GCD(b, b%a);
    }

    public static int LCM(int a,int b){
        int lcm=(a*b)/GCD(a, b);
        return lcm;
    }
    
    public static void main(String[] args) {
        int a=20;
        int b=5;

        System.out.println(GCD(a, b));
        System.out.println(LCM(a, b));
    }
}