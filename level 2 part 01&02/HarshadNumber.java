import java.util.*;

public class HarshadNumber {
	 public static void main(String[] args) {

	   Scanner sc = new Scanner(System.in);

	   System.out.println("enter 3 digit number");
	   int number = sc.nextInt();
       
       int temp = number;
	   int sum = 0;

	   while(number > 0) {

	         int digit = number % 10;
             sum = sum + digit; 
              number = number / 10;
	   }
	      if (temp % sum == 0) {
	           System.out.println("Harshad Number");
	      }
	        else {
	            System.out.println("Not Harshad Number");
	        }
	 }
}