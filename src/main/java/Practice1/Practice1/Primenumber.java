package Practice1.Practice1;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number");
		int num=sc.nextInt();
		
		boolean isPrime=true;
		
		if(num<=1)
		{
			isPrime=false;
		}
		
			for(int i=2; i<num;i++)
			{
				if(num%i==0)
				{
					isPrime=false;
					break;
				}
			}
		
		
		
		
		if(isPrime)
		{
			System.out.println("entered number is prime");
		}
		else
		{
			System.out.println("entered number is not prime");
		}



	}

}
