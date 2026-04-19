import java.util.*;

public class PerfectNumCheck {
	public static void main(String[] args) {

	   Scanner sc = new Scanner(System.in);

	   System.out.println("enter number");
	   int number = sc.nextInt();
       
       int original = number;
       int sum = 0;

	   for(int i=1; i<=number/2; i++) {
	        if(number % i == 0) {
	            // System.out.println(i);
	             sum = sum + i;
	        }
	   }
	     if(original == sum) {
	         System.out.println("Perfect number");
	     } else {
	         System.out.println("not perfect number");
	     }
	}
}