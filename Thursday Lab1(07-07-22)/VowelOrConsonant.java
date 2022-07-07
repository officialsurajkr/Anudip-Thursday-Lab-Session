
//W.a.p to input any alphabet and check whether its Vowel or Consonant

package basicprogram;
import java.util.Scanner;

public class VowelOrConsonant 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Alphabet");
		char X=sc.next().charAt(0);
		
		
		if((X=='A' || X=='E' || X=='I' || X=='O' || X=='U' ) ||
			(X=='a' || X=='e' || X=='i' || X=='o' || X=='u'))
			
			System.out.println(X + " is Vowel");
		
		else
			System.out.println(X + " is Consonant");
		
		
			
		sc.close();
	}

}
