package lab_01_9_22;

import java.util.ArrayList;
import java.util.Scanner;

public class RestaurentService 
{
	
	static ArrayList<Bill> alist= new ArrayList<Bill>();
	
	static void takeOrder(String fooditem , double price)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Quantity: ");
				int qnt=sc.nextInt();	
			alist.add(new Bill(fooditem, qnt, qnt*price));		
				
	}
	
	static void billing()
	{
		System.out.println("===================================");
		float total=0;
		for(Bill i: alist)
		{
			System.out.println(i.getFooditem()+" "+i.getQnt()+"  "+i.getPrice());
			total+=i.getPrice();
		}
					float gst=(float)total*0.10f;//calculating gst
					float netAmount=gst+total ;  //total amout with gst
		System.out.println("Bill: "+total);
		System.out.println("GST : "+gst);
		System.out.println("Total Amount including GST: "+netAmount);
	}
		

}