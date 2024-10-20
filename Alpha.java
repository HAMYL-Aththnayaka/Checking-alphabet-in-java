//Write a java program to check "*" is Alphabetic or not
import java.util.Scanner;

public class Alpha{
	public static void main(String args[]){

    Scanner reader=new Scanner(System.in);
	
	System.out.print("\nEnter Your character :");	
		char hello=reader.next().charAt(0);
		
		if((hello >= 'a' && hello <='z') || (hello >='A' && hello <='Z'))
			 System.out.println(hello+": is  Alphabetic");
		 else
			 System.out.println(hello+": is not Alphabetic");
	}
}