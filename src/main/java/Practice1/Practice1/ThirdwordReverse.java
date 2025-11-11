package Practice1.Practice1;

import java.util.Arrays;

public class ThirdwordReverse {

	public static void main(String[] args) 
	{
		String str="Java is good programing";
		String[] words=str.split("\\s+");
		String rev3="";
		if(words.length>=3)
		{
			String rev=words[2];
			for(int i=rev.length()-1;i>=0;i--)
			{
				rev3+=rev.charAt(i);
			}
		}
		
		System.out.println(rev3);
		words[2]=rev3;
		
		String str2=String.join(" ", words);
		System.out.print(str2);

	}

}
