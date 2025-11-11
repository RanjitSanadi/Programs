package Practice1.Practice1;

public class UpperToLowerCase {

	public static void main(String[] args) 
	{
		String s="ABCD ABCD";
		String r="";
		String f="";
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				ch= (char) (ch+32);
			}
			r=r+ch;
		}
		
		System.out.println(r);
		
		for(int i=0;i<r.length();i++)
		{
			char ch=r.charAt(i);
			
			if(ch>='a' && ch<='z')
			{
				ch=(char)(ch-32);
			}
			f=f+ch;
		}
		
		System.out.print(f);

	}

}
