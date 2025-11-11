package Practice1.Practice1;

public class NunDigitiEvenOrOdd {

	public static void main(String[] args) {
		int num=123453;
		int c_even=0;
		int c_odd=0;
		System.out.println(num);
		while(num!=0) 
		{
			int rem=num%10;
			
			if(rem%2==0)
			{
				System.out.println(rem +" is even");
				c_even++;
			}
			else
			{
				System.out.println(rem +" is odd");
				c_odd++;
			}
		num/=10;
			
		}
		
		System.out.println((c_even+c_odd) + " total digits in number");
		System.out.println(c_even +" are even");
		System.out.println(c_odd +" are odd");

	}

	}


