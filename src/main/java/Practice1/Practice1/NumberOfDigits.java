package Practice1.Practice1;

public class NumberOfDigits {

	public static void main(String[] args) 
	{
		int num=-123453;
		int c=0;
		
		while(num!=0) 
		{
			num=num/10;
			c++;
			
		}
		
		System.out.print(c);

	}

}
