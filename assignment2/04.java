import java.util.*;

class Decimal{
	public int Deci(int a, String s){
		if(a==0)
			return Integer.parseInt(s);
		s = Integer.toString(a%2)+s;
			return Deci(a/2,s);
	}
	public static void main(String args[]){
		Decimal deci = new Decimal();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Value : ");
		int n = sc.nextInt();
		String blank = "";
		System.out.println(deci.Deci(n,blank));
	}
}