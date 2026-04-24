import java.util.*;

public class Strong {
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
           fact = i * fact; 

	     }
         
         sum = fact + sum;
         number = number / 10;
	 }
	   if(original == sum) {
	       System.out.println("Strong number");
	   } else {
	       System.out.println("not Strong");
	   }
	}
}