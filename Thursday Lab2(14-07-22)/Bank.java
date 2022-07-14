/*  Create a bank class to Calculate Withdraw and deposit. if amount will
 	given from User.if amount is sufficient then "withdraw Successful"
 	will going print. Later on deposit 5000 rs in the account Balance
*/

package thursdaylab;
import java.util.Scanner;

public class Bank
{
	public static void main(String[] args) 
	{
		//Counter Variable for loop , 
		int accountbal=50000 , withdrawamount; //Declaring initial amt 50,000
		
		Scanner sc=new Scanner(System.in);  //Creating Scanner Object 
		System.out.println("Your Current Balance is "+accountbal);
		
		//taking withdraw amount from user
		System.out.println("Enter the withdraw amount");
		withdrawamount =sc.nextInt();
		
		if(withdrawamount <= accountbal)  //condition for withdraw
		{	
			accountbal -= withdrawamount ;
			System.out.println("Withdraw Successfully");
			System.out.println("Available Balance is "+accountbal);
		}
		else      
		{
			System.out.println("You Don't Have Sufficent Amount");
			accountbal+=5000;
			System.out.println("Deposit Succesfully");
			System.out.println("Updated Balance is"+accountbal);
		}
	}

}
