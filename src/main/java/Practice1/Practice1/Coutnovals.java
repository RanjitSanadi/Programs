package Practice1.Practice1;

public class Coutnovals {

	public static void main(String[] args)
	{
		String str="hasdqw@#AACi wqqwwq";
		str=str.toLowerCase();
		int oval=0;
		int cnso=0;
		str=str.toLowerCase();
		
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				if(str.charAt(i)=='a' ||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
				{
					oval++;
				}
				else
				{
					cnso++;
				}
				
			}
				
		}
		
		System.out.println("number of ovals :"+oval);
		System.out.println("number of cons :"+cnso);
		
		
		
	}

}
