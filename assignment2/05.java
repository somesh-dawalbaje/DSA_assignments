class Sum{
	public static void main(String args[]){
	int number = 21334;
	int sum = sumDigits(number);
	System.out.println("sum: " + sum);
	}
	
	public static int sumDigits(int num){
		if(num==0)
			return 0;
			
		else
		{
			return (num%10) + sumDigits(num/10);
		}
	}
}