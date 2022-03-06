package LearnCoding;

public class Replaceletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="HelloWorldaaaaaaaaaaaa0oooooooooooooo";
		
		char[] ch= new char[s.length()];
		
		String st="";
				
		for(int i=0;i<s.length();i++)
		{
		  if (s.charAt(i) == 'o')
		  {
			  ch[i] ='a';
		  }
		  else
		  {
			  ch[i]=(char) (ch[i] + s.charAt(i));
			  st=st+s.charAt(i);
		  }
		  		  
		}
		System.out.println(ch);
		System.out.println(st);
		
		
	}

}
