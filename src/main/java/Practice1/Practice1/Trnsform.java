package Practice1.Practice1;

public class Trnsform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String r="my name is xyz    fghj";
		String rr=r.replaceAll("\\s+", "-");
		System.out.println(rr);
		StringBuilder sb=new StringBuilder();
		
		for(int i=0; i<r.length();i++)
		{
			char ch=r.charAt(i);
			
			if(ch==' ')
			{
				sb.append('-');
			}
			else
			{
				sb.append(ch);
			}
			
		}
		
		System.out.print("{"+sb+"}");

	}

}
