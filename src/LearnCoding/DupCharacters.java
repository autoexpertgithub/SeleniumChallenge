package LearnCoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DupCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="TarunJayakumar";
		
		char[] ch=st.toCharArray();
		
		HashMap<Character,Integer> hmc=new HashMap<Character,Integer>();
		
		
		for(char c:ch)
		{
			if(hmc.containsKey(c))
			{
				hmc.put(c, hmc.get(c)+1);
								
			}
			else
			{
				hmc.put(c, 1);
				
			}
			
		}
		
		for(Map.Entry<Character, Integer> mp:hmc.entrySet())
		{
						
			
			if(mp.getValue()>1) 
			{
				System.out.println(mp.getKey()+"    "+mp.getValue());
			}		
		}
		
		
		
	}

}
