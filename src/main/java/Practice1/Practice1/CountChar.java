package Practice1.Practice1;

import java.util.HashMap;
import java.util.Map;

public class CountChar {

	public static void main(String[] args) 
	{
		String str="hjhjh jh";
		
		Map<Character, Integer> countMap=new HashMap<>();
		
		for(char c:str.toCharArray())
		{
			if(countMap.containsKey(c))
			{
				countMap.put(c, countMap.get(c)+1);
				
			}
			else
			{
				countMap.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry:countMap.entrySet())
		{
			System.out.println(entry.getKey() + ":"+ entry.getValue());
			
		}



	}

}
