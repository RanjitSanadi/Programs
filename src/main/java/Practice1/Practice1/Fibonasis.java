package Practice1.Practice1;

public class Fibonasis {

	public static void main(String[] args) 
	{
		
		int a=0;
		int b=1;
		int sum=0;
		
		for(int i=0; i<8; i++)
		{
			System.out.println(a);
			sum=a+b;
			a=b;
			b=sum;
		}
		

	}

}
