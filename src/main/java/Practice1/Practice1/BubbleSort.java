package Practice1.Practice1;

public class BubbleSort {

	public static void main(String[] args) 
	{
		
		int[] arr= {1,4,6,3,4,5};
		
		int n=arr.length;
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		/*System.out.println("Sorted array");
		for(int c:arr)
		{
			System.out.println(c);
		}*/



	}

}
