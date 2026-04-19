import java.util.*;

public class LargestDigit {
	public static void main(String[] args) {

	   Scanner sc = new Scanner(System.in);

	   System.out.println("enter number");
	   int number = sc.nextInt();
       
       int max = 0;

	   while(number != 0) {
	       int lastdigit = number % 10;
           
	        
	     if(lastdigit > max) {
	          max = lastdigit;
	     }

	        number = number / 10;  
	   }
	    System.out.println("largest digit is :- " + max);
	}
}