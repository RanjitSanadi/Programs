package Practice1.Practice1;

public class Trnasorm2 {

	public static void main(String[] args)
	{
		String s="my name is xyz";
		String r="";
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(ch==' ')
			{
				r=r+'-';
			}
			else
			{
				r=r+ch;
			}
		}
		
		System.out.print("{"+r+"}");

	}

}
