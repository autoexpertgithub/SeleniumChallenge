package LearnCoding;

public class LargSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,3,5,1,-5,-2};
		
		int max=arr[0];
		int sum=0;
		
		int min=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
				
		}
		
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]+sum <= 0)
			{
				sum=0;
			}
			else
			{
				sum=arr[j]+sum;
				
			}
		}
		max=Math.max(max, sum);
		System.out.println(max);
	}

}
