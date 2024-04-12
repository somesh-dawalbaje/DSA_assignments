class TailRec{
	public static int SumArr(int[] arr, int index, int sum){
		if(index == arr.length){
			return sum;
		}
		
		sum += arr[index];
		//System.out.println(sum);
		return SumArr(arr, index+1, sum);
	}
	
	public static void main(String[] args){
		int arr[] = {10,20,30,40,50};
		int sum = 0;
		sum = SumArr(arr, 0 , 0);
		System.out.println("Sum of arrays is: "+sum);
	}
}

