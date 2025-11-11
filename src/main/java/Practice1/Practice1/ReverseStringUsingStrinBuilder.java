package Practice1.Practice1;

public class ReverseStringUsingStrinBuilder {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String str="hello";
		StringBuilder sb=new StringBuilder(str);
		String reversew=sb.reverse().toString();
		sb.append(6);
		sb.append('c');
		sb.append("fff");
		
		System.out.println("Original string -> "+str);
		System.out.println("reversed string -> "+reversew);
		System.out.println(sb);

	}

}
