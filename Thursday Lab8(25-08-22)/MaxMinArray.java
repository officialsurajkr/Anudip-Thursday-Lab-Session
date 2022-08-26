package lab_25_8_22;

public class MaxMinArray
{
	public static void main(String[] args) 
	{
	
		int arr[]= {4,8,1,9,6};
		
		//Initializing first element of array in max and min variable
		int max=arr[0];
		int min=arr[0];
		
		//cal max and min
		for(int i=0; i<arr.length; i++)
		{
			
		if(arr[i]>max)
		
			max=arr[i];
		
		else if(min>arr[i])
		
			min=arr[i];

		}
		System.out.println("Maximum element is "+max);
		System.out.println("Minimum element is "+min);
		
	}
}
