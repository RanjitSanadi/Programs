package Practice1.Practice1;

public class PreserveWhiteSpace 
{
	public static void main(String[] args)
	{
		String str="qq d  hh kk";
		char[] arr=str.toCharArray();
		int i=0;
		int j=arr.length-1;
		
		
		while(i<j) 
		{
			if(arr[i]==' ')
			{
				i++;
				
			}else if(arr[j]==' ')
			{
				j--;
			}else
			{
				char temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
			
		}
		
		System.out.println("reversed");
		System.out.println(new String(arr));
		
	}

}
