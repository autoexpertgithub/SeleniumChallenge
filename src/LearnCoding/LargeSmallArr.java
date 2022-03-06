package LearnCoding;

public class LargeSmallArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,6,8,12};
		
		int min=arr[0];
		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		
		System.out.println("Minimum " +min+" Maximum "+max);
		
		
	}

}
