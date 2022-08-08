

/*
 * wap to find out maximum and minimum number in array.
 */

package thursdaylab;
import java.util.Scanner;

public class MaxMinArray 
{
	public static void main(String[] args) 
	{
		int arr[],size,i;
		
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the Size of Array");
			size=sc.nextInt();
			
			//initialize the array
			arr=new int [size];
			
			System.out.println("Enter "+size+" element in an array");
			
			//taking input from user
			for(i=0; i<size; i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.print("Arrey elements are: ");
			for(i=0; i<size; i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println(" ");
		
			
		//Initializing first element of array in max and min variable
			int max=arr[0];
			int min=arr[0];
			
			//cal max and min
			for(i=0; i<size; i++)
			{
				
			if(arr[i]>max)
			
				max=arr[i];
			
			else 
			
				min=arr[i];
			
		
	
			}
			System.out.println("Maximum element is "+max);
			System.out.println("Minimum element is "+min);
			
	}
}
