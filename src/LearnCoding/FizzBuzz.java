package LearnCoding;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  fizzBuzz(15);
	}

	
	public static void fizzBuzz(int n) {
	    // Write your code here
	    
	    for(int i=1;i<=n;i++)
	    {
	    	if ((i>2 ) && (i%4!=0))
	    	{
				    if ((i % 3) == 0 && (i%5)== 0)
				      {
				          System.out.println("FizzBuzz");
				      }
				    else if((i % 3)==0 || (i %5 ) !=0)
				      {
				        System.out.println("Fizz");   
				      }
				    else if ((i % 5)==0 || (i%3) !=0)
				    {
				        System.out.println("Buzz");
				    }
				    else if((i % 3)!=0 || (i%3) !=0)
				    {
				       System.out.println(i); 
				    }
				    else
				    {}
	    
	    	}
	    	else
	    	{
	    		System.out.println(i);
	    	}
	    }

	    }
}
