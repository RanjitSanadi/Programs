package Practice1.Practice1;

import java.util.HashMap;
import java.util.Map;

public class MaxCharecter {

	public static void main(String[] args) 
	{
		String str="jkhkhk";
		
		Map<Character, Integer> countMap=new HashMap<>();
		
		if(str=="")	
		{
			System.out.print("stop");
			return;
		}
		
		System.out.println("stopqq");
		
		for(Character c:str.toCharArray()) 
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
		
		for(Map.Entry<Character, Integer> entyr:countMap.entrySet()) 
		{
			System.out.println(entyr.getKey() +":"+ entyr.getValue());
		}
		
		int maxcount=0;
		for(Integer countc:countMap.values()) 
		{
			if(countc>maxcount)
			{
				maxcount=countc;
			}
		}
		
		for(Map.Entry<Character, Integer> entyr:countMap.entrySet()) 
		{
			if(entyr.getValue()==maxcount)
			{
				System.out.print(  entyr.getKey()+ ":"+ entyr.getValue());
			}
		}

	}

}
