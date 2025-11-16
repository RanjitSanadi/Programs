package Practice1.Practice1;

import java.util.HashSet;
import java.util.Set;

public class A {

	public static void main(String[] args) 
	{
		String s="hello world java";
		String r="";
		String word="";
		
		
		for(int i=0; i<s.length();i++)
		{
			char c=s.charAt(i);
			
			if(c!=' ')
			{
				word+=c;
			}else
			{
				for(int j=word.length()-1; j>=0;j--)
				{
					r=r+word.charAt(j);
				}
				r=r+" ";
				word="";
			}
		}
		for(int j=word.length()-1; j>=0;j--)
		{
			r=r+word.charAt(j);
		}
		
		System.out.print(r);

	}
}
