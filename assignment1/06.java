class armstrongNumber{
    public static int countDigits(int number) {
        if(number == 0) {
            return 0;
        } else {
            return 1 + countDigits(number / 10);
        }
    }

   
    public static boolean isArmstrong(int number, int numDigits) {
        int originalNumber = number;
        int sum = 0;
        
        while(number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }
        
        return sum == originalNumber;
    }
    public static void main(String[] args) {
        int n=143;
        int numDigits=countDigits(n);
        if(isArmstrong(n, numDigits))
            System.out.println("armstrong number");
        else
            System.out.println("not armstrong number");       
    }
}