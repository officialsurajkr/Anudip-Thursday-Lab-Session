package lab_01_9_22;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import collectionframework.Employee;

public class RestaurentMain
{
	public static void main(String[] args) 
	{
		Map<Integer, Menu> restMap=new HashMap<Integer, Menu>();
		
		restMap.put(1, new Menu(1, "Momo         ", 80 ));
		restMap.put(2, new Menu(2, "Dosa         ", 100));
		restMap.put(3, new Menu(3, "Biryani      ", 250));
		restMap.put(4, new Menu(4, "Butter Masala", 250));
		
		
		//print
		System.out.println("---Welcome to our Restaurent---");
		System.out.println("Food Items            Price");
		Iterator itr =restMap.keySet().iterator();
		while(itr.hasNext())
		{
			Menu menu=(Menu)restMap.get(itr.next());
			System.out.println(" "+menu.getId()+") "+menu.getFooditem()+
					"     :"+menu.getPrice());
			
		}
		
		
		int choice;
		String ch;
		Scanner sc=new Scanner(System.in);
		
		RestaurentService rs=new RestaurentService();
		System.out.println("===================================");
		do {
			
			System.out.println("Enter Your Choice");
				 choice=sc.nextInt();
				 switch (choice)
				 {
				 	case 1:
				 		Menu m=(Menu) restMap.get(1);
				 		rs.takeOrder(m.getFooditem(), m.getPrice());
					 break;
					 
				 	case 2:
				 		Menu m1=(Menu) restMap.get(2);
				 		rs.takeOrder(m1.getFooditem(), m1.getPrice());
						 break;
						 
				 	case 3:
				 		Menu m3=(Menu) restMap.get(3);
				 		rs.takeOrder(m3.getFooditem(), m3.getPrice());
						 break;
				 	case 4:
				 		Menu m4=(Menu) restMap.get(4);
				 		rs.takeOrder(m4.getFooditem(), m4.getPrice());
						 break;
						 default:
							 System.out.println("Sorry This is Wrong Choice. Please right correct choice");
							 System.exit(0);
							 break;
				 }
				 System.out.println("Continue billing press y/n:");
				 ch=sc.next();
			}
		while(ch.equalsIgnoreCase("y"));
		rs.billing();
		System.out.println("Thank You for visiting our Restrarunt..");
	}
}
