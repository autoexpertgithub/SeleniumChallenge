package LearnCoding;

public class MissingNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {0,1,3};
		  int n=arr.length;
		  int sum=n * (n+1)/2;
		  int summ=0;
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 summ=arr[i]+summ;
		 }
		 
		 System.out.println(sum-summ);
	}

}
