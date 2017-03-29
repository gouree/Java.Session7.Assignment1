/*
 * Write a program to convert an int variable to String 
 * using an inbuilt function of String class
 */
import java.util.*;
public class StringConvert 
{
	public static void main(String args[])
	{
		Convert c = new Convert();	//object of class Convert
		c.getValue();
		c.display();
		
				
	}
}

class Convert
{
	String s;
	int a;
	Scanner input= new Scanner(System.in);
	
	/*
	 * method to accept integer and convert it to string using inbuilt function
	 */
	
	void getValue()
	{
		System.out.println("Enter int value -->");
		a= input.nextInt();
		
		s= String.valueOf(a);
		
	}
	
	
	//method to display the result
	void display()
	{
		System.out.println("Integer Value Entered by user -->"+a);
		
		System.out.println("String Value  -->"+s);
		
	}
}