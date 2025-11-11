package Practice1.Practice1;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine().replaceAll("\\s", "").toLowerCase();
		String str2=sc.nextLine().replaceAll("\\s", "").toLowerCase();
		
		System.out.println(str1);
		System.out.println(str2);
		
		if(str1.length()!=str2.length())
		{
			System.out.println("Strings are not anagaram");
			return;
		}
		
		char[] ar1=str1.toCharArray();
		char[] ar2=str2.toCharArray();
		
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		
		if(Arrays.equals(ar1, ar2))
		{
			System.out.println("Strings are  anagaram");
		}
		else
		{
			System.out.println("Strings are not anagaram");
		}



	}

}
