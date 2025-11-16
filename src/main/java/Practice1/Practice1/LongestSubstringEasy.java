package Practice1.Practice1;

public class LongestSubstringEasy {

	public static void main(String[] args) 
	{
		String s="anbcdsssddddddqwertyui";
		String longest="";
		
		for(int i=0;i<s.length();i++)
		{
			String current="";
			
			for(int j=i; j<s.length();j++)
			{
				char ch=s.charAt(j);
				
				if(current.contains(ch+""))
				{
					break;
				}
				
				current=current+ch;
			}
			if(current.length()>longest.length())
			{
				longest=current;
			}
		}
		
		System.out.println(longest);
		System.out.println(longest.length());

	}

}
