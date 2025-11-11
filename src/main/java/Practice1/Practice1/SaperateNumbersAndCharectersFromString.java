package Practice1.Practice1;

public class SaperateNumbersAndCharectersFromString {

	public static void main(String[] args) 
	{
		String str="arfts34567shs667";
		String charecters="";
		String num="";
		
		for(int i=0; i<str.length(); i++)
		{
			char c=str.charAt(i);
			if((c>='a' && c<='z' ) || (c>='A' && c<='Z' ))
			{
				charecters+=c;
			}
			else
			{
				num+=c;
			}
		}
		
		System.out.println(charecters);
		System.out.println(num);



	}

}
