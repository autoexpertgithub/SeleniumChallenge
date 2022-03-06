package LearnCoding;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="Jayakumar";
		
		char[] ch=new char[st.length()];
		
		String s="";
		
		for(int i=st.length()-1;i>=0;i--)
		{
			s=s+st.charAt(i);
		}
		
		System.out.println(s);
	}

}
