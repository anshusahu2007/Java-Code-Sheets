import java.util.*;

public class Armstrong {
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);

	   System.out.println("enter number");
	   int number = sc.nextInt();

       int original = number; 
       int total = 0;

	   while(number != 0) {
	      int lastdigit = number % 10;
	      total = total + lastdigit * lastdigit * lastdigit;
	      number = number / 10;
	   }
           
          if(original == total) {
          	  System.out.println("Armstrong number");
          } else {
          	  System.out.println("not Armstrong number");
          }


	}
}