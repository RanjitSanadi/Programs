package Practice1.Practice1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemovingDuplicates {

	public static void main(String[] args) 
	{
		int[] arr= {1,6,8,45,3,6,5,6,8,9};
		
		int n=arr.length;
		int[] temp=new int[n];
		int j=0;
		
		Arrays.sort(arr);
		
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]!=arr[i+1]) 
			{
				temp[j++]=arr[i];
			}
		}
		
		temp[j++]=arr[n-1];
		
		int[] uniq=new int[j];
		
		for (int i=0; i<j; i++)
		{
			uniq[i]=temp[i];
		}
		for(int c:uniq) 
		{
			System.out.println(c);
		}

	}

}







/*   
 int a[]= {2,4,5,3,4,5,8,7};
		
		Set<Integer> set=new HashSet<>();
		
		for(int n:a)
		{
			set.add(n);
		}
		
		for(int c:set)
		{
			System.out.println(c);
		}
  
 */
