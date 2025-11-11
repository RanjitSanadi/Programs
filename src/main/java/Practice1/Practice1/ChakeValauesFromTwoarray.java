package Practice1.Practice1;

import java.util.Arrays;
import java.util.List;

public class ChakeValauesFromTwoarray {

	public static void main(String[] args) 
	{
		String[] s1= {"java", "Python", "#c"};
		String[] s2= {"java", "Python"};
		
		List<String> l1=Arrays.asList(s1);
		List<String> l2=Arrays.asList(s2);
		
		for(String str:l1)
		{
			if(!l2.contains(str))
			{
				System.out.print(str);
			}
		}
	}

}
