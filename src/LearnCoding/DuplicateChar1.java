package LearnCoding;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String st="Jayakumar";
       
       char[] ch=st.toCharArray();
       
       HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
       
       for(char c: ch)
       {
    	   if(hm.containsKey(c))
    	   {
    		   hm.put(c, hm.get(c)+1);
    	   }
    	   else
    	   {
    		   hm.put(c, 1);
    	   }
       }
       
       for(Map.Entry<Character, Integer> m:hm.entrySet())
       {
    	      	   
    	   System.out.println(m.getKey()+"  "+m.getValue());
       }
    		   
    		   
	}

}
