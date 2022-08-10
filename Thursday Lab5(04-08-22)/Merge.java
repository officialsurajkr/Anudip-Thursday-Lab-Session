package thursdaylab;

import java.util.Scanner;

public class Merge 
{
	public static void main(String[] args)
	{
		int a[]=new int[5];
		int b[]=new int[5];
		int c[]=new int[a.length+b.length];
		
		Scanner sc = new Scanner(System.in);
		int i , p=5;
		System.out.println("Enter 5 elements in the first array");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("Enter 5 elemnts in second array");
		
		for(i=0;i<5;i++)
		{
			b[i]=sc.nextInt();
			
		}
		
		for(i=0;i<5;i++)
		{
			c[i]=a[i];
			
		}
		for(i=0;i<5;i++)
		{
//			c[p]=a[i];
//			p++;
			
			c[p++]=b[i]; //using post increment
			
			
		}
		
		System.out.println("after merge the array");
		for(i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
			
		}
		
		
		
		
		
		
	}

}
