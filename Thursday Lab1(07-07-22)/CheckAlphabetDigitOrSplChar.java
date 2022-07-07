
//W.a.p to input any Character and check whether its alphabet , digit or special character.

package basicprogram;
import java.util.Scanner;

public class CheckAlphabetDigitOrSplChar
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		  System.out.println("Enter a Character");
		  char X=sc.next().charAt(0);
		 
		 if((X>='A' && X<='Z') || (X>='a' && X<='z'))
		 	System.out.println(X+" is Alphabet");
		 
		 else if(X>='0' && X<='9')
			 System.out.println(X+" is Digit Value..");
		 
		 else
			 System.out.println("It is Special Charactor");
		 
		 
		 sc.close();
		
	}

}
