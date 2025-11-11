package Practice1.Practice1;

public class ViseVersaUpperLower {

	public static void main(String[] args) 
	{
		String s="AAvcA s";
		String r="";
		
		for(int i=0; i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			
				if(ch>='a' && ch<='z')
				{
					ch=(char)(ch-32);
				}else if(ch>='A' && ch<='Z')
				{
					ch=(char)(ch+32);
				}
				r+=ch;
			
			
		}
		
		System.out.print(r);

	}

}
