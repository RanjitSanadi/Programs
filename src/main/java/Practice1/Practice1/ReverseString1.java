package Practice1.Practice1;

public class ReverseString1 {

	public static void main(String[] args) 
	{
		String str="reverse a string";
		//str.split(" ");
		
		
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		
		
		
		System.out.println(str);
		System.out.println(rev);



	}

}
