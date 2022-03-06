package LearnCoding;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num= {2,7,11,5};
		int tgt=12;
		int[] re=twosumm(num,tgt);
		
		System.out.println(Arrays.toString(re));
	}
	
	public static int[] twosumm(int[]num,int tgt)
	{
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		
		for(int i=0;i<num.length;i++)
		{		
		  if(hm.containsKey(tgt-num[i]))
		  {
			  return new int[] {i,hm.get(tgt-num[i])};			  
		  }
		  else
		  {
			  hm.put(num[i], 1);
		  }
		  
		}
		return null;
	}

}
