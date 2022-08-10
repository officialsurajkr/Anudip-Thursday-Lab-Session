
/*
 * wap to add two array elements and store it in different array
 */
package thursdaylab;

public class AddTwoArray
{
	public static void main(String[] args) 
	{
		
		int arr[]= {2,3,4,7};
		int arr2[]= {3,4,3,1};
		
		int length = arr.length ;
		
		//creating another array 
		int arr3[]= new int[length];
		
		for(int i=0 ;i< length; i++)
		{
			 arr3[i]= arr[i]+ arr2[i];
			 
			 System.out.println(arr3[i]);
		}
			
	}

}
