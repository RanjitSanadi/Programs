package Practice1.Practice1;

public class CharecterOccuranceInString {

	public static void main(String[] args) 
	{
		String str="Hello world";
		char target='l';
		int count=0;
		for(int i=0; i<str.length();i++) 
		{
			if(str.charAt(i)==target)
			{
				count++;
			}
			
		}
		
		System.out.print("the charecter "+target+"occured "+count + " times");
		

	}

}
