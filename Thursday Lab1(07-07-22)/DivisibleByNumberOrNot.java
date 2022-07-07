
//W.a.p to check if the number is divisible by 5 and 11 or Not.

package basicprogram;
import java.util.Scanner;

public class DivisibleByNumberOrNot 
{
	public static void main(String[] args) 
	{
		int number;
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("Enter the Number:");
		number=sc.nextInt();
		
		if(number%5==0 && number%11==0)
			System.out.println(number+" is Divisible by 5 and 11 ");
		else 
			System.out.println(number + " is not Divisible by 5 and 11");
		
		sc.close();
	}
}


