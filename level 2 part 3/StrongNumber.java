import java.util.*;

public class StrongNumber {
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);

	   System.out.println("enter number");
	   int number = sc.nextInt();
        
        int original = number;
        int sum = 0;

	   while(number != 0) {
	     int digit = number % 10;
         
         int fact = 1;
         for(int i=1; i<=digit; i++) {
           fact = fact * i;
         }
           sum = sum + fact;
           number = number / 10;
	   }

	     if(original == sum) {
	         System.out.println("number strong");
	     }  else {
	         System.out.println("strong");
	     }
	}
}