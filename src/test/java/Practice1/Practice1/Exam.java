package Practice1.Practice1;

import java.util.HashMap;
import java.util.Map;

public class Exam {

	
	
		public static void main(String[] args) {
			String s="progggraammiiingggggg";
			
			Map<Character, Integer> m=new HashMap<>();
			
			for(char c:s.toCharArray())
			{
			    if(m.containsKey(c))
			    {
			        m.put(c, m.get(c)+1);
			    }
			    else{
			        m.put(c,1);
			    }
			}
			
			for(Map.Entry<Character, Integer> entry:m.entrySet())
			{
			    System.out.println(entry.getKey() +" : "+entry.getValue());
			}
		}
	}

