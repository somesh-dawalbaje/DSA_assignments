class reverseFibonacchi {
	public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
	public static void printReverseFibonacci(int n) {
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(fibonacci(i) + " ");
        }
    }
	
	public static void main(String[] args) {
		 int n = 10; 
	        System.out.println("Fibonacci Series in reverse order Is :");
	        printReverseFibonacci(n);
	}

}