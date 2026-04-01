import java.util.*;

public class LargestDigitNumber {
	  public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);

	    System.out.println("enter 4 number");
	    int number = sc.nextInt();

	    int first = (number / 1000);
	    int second = (number % 1000) / 100;
	    int third = ((number % 1000) % 100) / 10;
	    int four = ((number % 1000) % 100) % 10;

	    if(first > second && first > third && first > four) {
	    	 System.out.println("largest is := " + first);
	    } 
	      else if (second > third && second > four) {
	      	 System.out.println("largest is := " + second);
	      }
	        else if (third > four) {
	        	System.out.println("largest is := " + third);
	        } 
	           else {
	           	   System.out.println("largest is := " + four);
	           }

	   }
}