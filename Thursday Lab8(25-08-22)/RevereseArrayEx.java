package lab_25_8_22;

//print reverse of an array

public class RevereseArrayEx 
{
	public static void main(String[] args) {
		
	
	int []arr= {1,2,3,4,5};
	
	//print reverse array
	System.out.println("Reverse Order of Given Array");
	for(int i=arr.length-1; i>=0; i--)
	{
		
		System.out.print(arr[i]+" ");
	}
	
	}
}
