/*	Print this Program
		1
		1 2
		1 2 3
		1 2 3 4
		1 2 3 4 5
 */
package thursdaylab;
public class NumberPatternProgram 
{
	public static void main(String[] args)
	{
		int i,j ;  //Variable for loop
		
		for(i=1 ; i<=5 ; i++) //it will calculate no.of rows
	       {
			for(j=1 ; j<=i ; j++)
			   {
					System.out.print(j+" ");
			   }
				System.out.println();
			}
			
	}
}


