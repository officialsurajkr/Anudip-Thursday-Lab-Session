
//W.a.p to check Whether a Character is UpperCase or LowerCase .
package basicprogram;
import java.util.Scanner;

public class UpperOrLower 
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Charactor");
		char X=sc.next().charAt(0);
		
		if(X>='A' && X<='Z')
			System.out.println(X+ " is Upper Case");
		else if (X>='a' && X<='z')
			System.out.println(X+" is Lower case");
		else
			System.out.println("Invalid......");
		
		sc.close();
		
	}

}
