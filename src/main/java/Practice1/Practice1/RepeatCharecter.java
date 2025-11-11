package Practice1.Practice1;

public class RepeatCharecter {

	public static void main(String[] args) 
	{
		String str="abcde";
		
		for(int i=0; i<str.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(str.charAt(i));
			}
		}

	}

}
