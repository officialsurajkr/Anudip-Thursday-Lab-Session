package lab_25_8_22;


/*
  
         * 
       * * * 
     * * * * * 
   * * * * * * * 
 * * * * * * * * *
 
  
  
  */
public class StarPatterEx
{
	public static void main(String[] args)
	{
			int i,j,k;
		
		for(i=1;i<=5;i++)
		{
			for(j=i ; j<5 ; j++)
			{
				System.out.print(" ");
			}
			
			//if(i%2!=0)
			for(k=1 ; k<(i*2) ; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	}
