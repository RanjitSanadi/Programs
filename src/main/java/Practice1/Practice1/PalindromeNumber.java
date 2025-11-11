package Practice1.Practice1;

public class PalindromeNumber {

	public static void main(String[] args) 
	{
		int num=1234321;
		int org=num;
		int rev=0;
		
		while(num!=0)
		{
			int temp=num%10;
			rev=rev*10+temp;
			num=num/10;
		}
		
		System.out.println("original number ->" +org);
		System.out.println("reverse number ->" +rev);
		
		if(org==rev)
		{
			System.out.println("number is palindrome ->" );
		}else
		{
			System.out.println("number is not palindrome" );
		}

	}

}
