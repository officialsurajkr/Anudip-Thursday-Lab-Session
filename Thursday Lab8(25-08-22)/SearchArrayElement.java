package lab_25_8_22;

import java.util.Scanner;

public class SearchArrayElement 
{
	public static void main(String[] args) {
		
	
	int i ,size,search,arr[];

	int pos=-1;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the size of array");
			size=sc.nextInt();
			
			 //instancetiate array
			 arr=new int[size];
			 
			//initialize array
			 System.out.println("Enter "+ size+" elements in an array");
			 for(i=0; i<size;i++)
			 {
				 arr[i]=sc.nextInt();
			 }
			 
			 System.out.println("Enter the elemnet you want to search for");
			 search=sc.nextInt();
			 
			 //found the element
			 for(i=0; i<size; i++)
			 {
				 if(arr[i]==search)
				 {
					 pos=i;
					 break;
				 }
			 }
			 if(pos!=-1)
			 {
				 System.out.println("data found at "+(pos+1)+" position");
			 }
			 else
			 {
				 System.out.println("Data not found");
			 }
			 
	
	
	
}
}