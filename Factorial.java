package LogicalProgram;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	   {
	      int a, c, fact = 1;
	 
	      System.out.println("Enter the number:");
	      Scanner s = new Scanner(System.in);
	 
	      a=s.nextInt();
	 
	      if ( a< 0 )
	         System.out.println("Number should be positive:");
	      else
	      {
	         for ( c = 1 ; c <= a ; c++ )
	            fact = fact*c;
	 
	         System.out.println("Factorial of "+a+" is = "+fact);
	      }
	   }

}
}
