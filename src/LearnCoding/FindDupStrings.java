package LearnCoding;

import java.util.HashMap;
import java.util.Map;

public class FindDupStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "this is apex apex";
		
		String[] ss=str.split(" ", 0);
		
		int j=1;
		   
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		
		 for(String st:ss)
		 {
				 if(hm.containsKey(st))
				 {
					 hm.put(st, hm.get(st)+1);
				 }
				 else
				 {
					 hm.put(st, 1);				 
				 }
		
	     }
		 
		 /*
		 
		 for(int k:hm.keySet())
		 {
			  
			  System.out.println(k);
		 }
		 
		 for(String v:hm.values())
		 {
			 
			 System.out.println(v);
		 }
		 */
		 
		 for(Map.Entry<String, Integer> en:hm.entrySet() )
		 {
			 if (en.getValue()>1)
			 {
			 System.out.println("Key :"+en.getKey()+" Value :"+en.getValue());
			 }
			 
			 
		 }
	}
	}

