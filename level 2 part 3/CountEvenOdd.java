import java.util.*;

public class CountEvenOdd {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("enter number");
	        int number = sc.nextInt();
             
             int evendigit = 0; 
             int odddigit = 0;

	        while(number != 0) {
	             int check = number % 10;

	         if(check % 2 == 0) {
	                evendigit++;
	         }  else {
	                odddigit++;
	        }
	            number = number / 10;  
	    }
	       System.out.println("total even digit = "+ evendigit);
	       System.out.println("total odd digit = "+ odddigit);
	 }
}