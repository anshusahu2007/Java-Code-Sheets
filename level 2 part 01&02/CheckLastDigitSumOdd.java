import java.util.*;

public class CheckLastDigitSumOdd {
	  public static void main(String[] args) {

	   Scanner sc = new Scanner(System.in);

	   System.out.println("enter number");
	   int number = sc.nextInt();

	   //int result = (number % 10);

	    //if(result % 2 == 0)

	    if ((number % 10) % 2 == 0) {
	        System.out.println("Number is Sum");
	   } 
	     else {

	          System.out.println("Number is Odd");
	     }

      }
}