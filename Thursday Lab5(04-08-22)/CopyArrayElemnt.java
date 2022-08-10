package thursdaylab;

public class CopyArrayElemnt
{
	public static void main(String[] args) 
	{
		int arr[]= {3,2,4,8};
	
		int length=arr.length;
		
		int arr2[]=new int[length];
		
		for(int i=0 ; i<length ; i++)
		{
			arr2[i]=arr[i];
			
		}
		
		for(int i=0; i<length; i++)
		{
		System.out.println(arr2[i]);
		}
		
		
		
	}

}
