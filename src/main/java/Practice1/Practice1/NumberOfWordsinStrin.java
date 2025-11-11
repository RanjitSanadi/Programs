package Practice1.Practice1;

import java.util.HashMap;
import java.util.Map;

public class NumberOfWordsinStrin {

	public static void main(String[] args) 
	{
		String str="abc abc bb cd  a a cd ff abc";
		str=str.replaceAll("[^a-z\\s]", "");
		
		String[] words=str.split("\\s");
		
		Map<String,Integer> cw=new HashMap<>();	
		
		for(String s:words)
		{
			if(cw.containsKey(s))
			{
				cw.put(s, cw.getOrDefault(s, 0)+1);
			}else
			{
				cw.put(s, 1);
			}
		}
		
		for(Map.Entry<String, Integer> entry:cw.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		String hw="";
		int maxc=0;
		
		for(Map.Entry<String, Integer> entry:cw.entrySet())
		{
			if(entry.getValue()>maxc)
			{
				hw=entry.getKey();
				maxc=entry.getValue();
			}
		}
		
		System.out.println("highest number of word: "+ hw);
		System.out.println("how many times: "+ maxc);
		
	}

}
