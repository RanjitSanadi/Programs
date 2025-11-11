package Practice1.Practice1;

public class SecondlargestInTheArray {

	public static void main(String[] args) 
	{
		int[] arr= {2,4,8,3,2,7};
		
		int largest=0;
		int secondLargest=0;
		System.out.println(secondLargest);
		System.out.println(largest);
		System.out.println("_______________________________");
		
		for(int i=0;i<arr.length;i++)
		{
			int current=arr[i];
			
			if(current>largest)
			{
				secondLargest=largest;
				largest=current;
			}
			else if(current>secondLargest && largest!=current)
			{
				secondLargest=current;
			}
			
		}
		
		System.out.print(secondLargest);

	}

}
