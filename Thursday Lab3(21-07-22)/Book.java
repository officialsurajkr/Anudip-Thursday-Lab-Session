
/*1.write a program to create Book management system.
create class name Book,and perform following actions:
Attributes:bookid,bookName,bookPrice,authorName,
library name(static),availability
method:
createBook() will store book details.(add atleast 5 books).
displayBook()will display book details
displayBookByName(): display specific book details based on bookName
borrowBook(): borrow book if book is available based on bookName,
then make availability status as "not available"*/



package thursdaylab;
import java.util.Scanner;

public class Book 
{
	//instance Variable
	int bookId;
	String bookName, authorName;
	float bookPrice;
	static String library= "Anudip Library";
	String availanlity;
	
	//parameterized Constructor
	public Book(int bookId ,String bookName , String authorName, float bookPrice)
	{
		//local Variable
		this.bookId=bookId;
		this.bookName=bookName;
		this.authorName=authorName;
		this.bookPrice=bookPrice;	
	}
	
	public void displayBookByName()
	{
		Scanner sc=new Scanner(System.in); //Scanner Class
		System.out.println("Enter the Book Name");
		String bname=sc.next();
		//checking book availability
		if(bname.equals(bookName))
				{
					System.out.println(bname+" is available in "+library);
					this.dispalyBookDetails();
				}
		else {
			System.out.println(bname+" is not availabe in "+library);
			}
		
	}
	
	
	public void dispalyBookDetails()
	{
//		System.out.println("Book Id:"+bookId+" Book Name:"+bookName
//	+" Author Name:"+authorName+" Book Price:"+bookPrice+" Library Name:"+library);
//		System.out.println("=========================");
//		
		
		System.out.println("Book Id "+bookId);
		System.out.println("Book Name "+bookName);
		System.out.println("Author Name "+authorName);
		System.out.println("Book Price "+bookPrice);
		System.out.println("Library Name "+library);
		System.out.println("==========================");
	}
	
	public static void main(String[] args) 
	{
				
		Book obj1=new Book(101, "Java","James Gosling",230);
				 obj1.displayBookByName();
			
			Book obj2=new Book(102, "C++","Bjarne Stroustrup",440);
				 obj2.displayBookByName();
			
			Book obj3=new Book(103, "Python","Guido van Rossum",320);
				 obj3.displayBookByName();
		
		
				
				
			
		
	}
	
	

}
