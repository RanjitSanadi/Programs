package Practice1.Practice1;

public class ReverseWords {

	public static void main(String[] args) 
	{
		String str=" Hello   r world java";
		String result="";
		String word="";
		
		for(int i=0; i<str.length();i++)
		{
			char c=str.charAt(i);
			
			if(c!=' ')
			{
				word+=c;
			}
			else
			{
				for(int j=word.length()-1;j>=0;j--)
				{
					result=result+word.charAt(j);
				}
				
				result=result+" ";
				word="";
			}
			
			
		}
		for(int j=word.length()-1;j>=0;j--)
		{
			result=result+word.charAt(j);
		}
		
		
		System.out.println("Reversed words: " + result);

	}

}
