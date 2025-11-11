package Practice1.Practice1;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) 
	{
		String s="string duplicates";
		String r="";
		
		for(int i=0; i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(r.indexOf(ch)==-1)
			{
				r+=ch;
				
			}
		}
		System.out.println("original-> " +s);
		System.out.println("duplicates removed-> " +r);


	}

}
