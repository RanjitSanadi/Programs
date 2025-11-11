package Practice1.Practice1;

public class ReverseTheSantance {

	public static void main(String[] args) 
	{
		String str="Hello worl cup";
		String[] str1=str.split(" ");
	String 	f=new StringBuilder(str1[0]).reverse().toString();
		
		String rev="";
		
		for(int i=str.length()-1; i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println(str);
		System.out.println(str1);
		System.out.print(rev);

	}

}
