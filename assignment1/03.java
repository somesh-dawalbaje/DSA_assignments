import java.util.Scanner;

class PrimeFactors{
  
    public static boolean primeCheck(int n, int i){
        if(n<=1)
            return false;

        if(i==n)
            return true;
        
        if(n%i==0)
            return false;

        return primeCheck(n, i+1);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(primeCheck(n, 2))
            System.out.println("prime");
        else
            System.out.println("not prime");
    }
}