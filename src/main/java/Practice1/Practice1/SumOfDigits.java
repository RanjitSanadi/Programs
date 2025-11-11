package Practice1.Practice1;

public class SumOfDigits {

	public static void main(String[] args) 
	{
		int num=123453;
		System.out.println("");
		int sum=0;
		
		while(num!=0)
		{
			int rem=num%10;
			sum+=rem;
			num=num/10;
					
		}
		
		System.out.println(sum+ " sum");

	}

}
